import React, { useContext, useState } from 'react';
import { styled } from "@mui/material/styles";
import TextField from '@mui/material/TextField';
import Button from '@mui/material/Button';
import axios, { AxiosResponse } from 'axios';
import { Paper } from '@mui/material';
import { LoginStatus, UserInfo } from '../../types/frontend.js';
import { useNavigate } from 'react-router';
import { fullUrl } from '../../../backend';
import { UserInfoContext } from '../../common/Contexts';

export interface LoginFormProps {
  setLoginStatus:(loginStatus: LoginStatus) => void,
  setContextUserInfo: (userInfo:UserInfo) => void,
}

const LoginBoxWrapper = styled(Paper) ({
  width: '300px',
  height:'300px',
  margin: '0 auto',
  marginTop: '20px',
  padding: '20px',
  border: '1px solid #ccc',
  borderRadius: '5px',
  backgroundColor: '#fff',
});

const LoginInput = styled(TextField) ({
  width:'100%',
  marginBottom:'20px',
});

type ResponseData = {
  "id": number,
  "name": string,
  "birthday": Date,
  "gender": string,
  "mobile_phone": number,
  "email": string,
};


function LoginBox(props: LoginFormProps) {
  const [loginFormData, setLoginFormData] = useState({
    username:'',
    password:'',
  });

  const navigate = useNavigate();
  const context = useContext(UserInfoContext);

  const handleSubmit = (event: React.FormEvent<HTMLFormElement>) => {
    event.preventDefault();
    const url = fullUrl('/login');
    console.log(url);
    axios.post(url, {}, {
      params: {
        username: loginFormData.username,
        password: loginFormData.password,
      }
    }).then(function (response:AxiosResponse<string>) {
      if (response.status == 200) {
        props.setLoginStatus("loggedin");
        
        const responseData:ResponseData = JSON.parse(JSON.stringify(response.data));
        console.log(response.data)
        let newUserInfo:UserInfo = {
          userId: responseData.id,
          userName: responseData.name,
          email: responseData.email,
          mobilePhone: responseData.mobile_phone,
          birthday: responseData.birthday,
          gender: responseData.gender,
        }
        props.setContextUserInfo(newUserInfo);
        console.log('success\n');
        // navigate('/user');
      }
    }).catch(function (error) {
      console.log(error);
    });
  };


  return (
    <LoginBoxWrapper>
      <form onSubmit={handleSubmit}>
            <LoginInput
              label="Username"
              size='small'
              fullWidth
              autoFocus
              sx={{marginBottom:'20px'}}
              value={loginFormData.username}
              onChange={(event) => setLoginFormData({...loginFormData, username:event.target.value})}
            />
            <LoginInput
              label="Password"
              type="password"
              fullWidth
              size='small'
              value={loginFormData.password}
              onChange={(event) => setLoginFormData({...loginFormData, password:event.target.value})}
            />
            <Button variant="contained" color="primary" type="submit">
              Login
            </Button>
      </form>
    </LoginBoxWrapper>
    
  );
}

export default LoginBox;