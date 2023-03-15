import React, { useState } from 'react';
import { styled } from "@mui/material/styles";
import TextField from '@mui/material/TextField';
import Button from '@mui/material/Button';
import axios, { AxiosResponse } from 'axios';
import config from '../../../backend.config.js'
import { Paper } from '@mui/material';
import { LoginStatus } from '../../types/frontend.js';

type LoginFormProps = {
  children: {
    setLoginStatus: (loginStatus: LoginStatus) => void;
  }
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
})


function LoginBox(props: LoginFormProps) {
  const [loginFormData, setLoginFormData] = useState({
    username:'',
    password:'',
  });

  const handleSubmit = (event: React.FormEvent<HTMLFormElement>) => {
    event.preventDefault();
    const url = 'http://' + config.baseUrl + ':' + config.port + '/login';
    console.log(url);
    axios.post(url, {}, {
      params: {
        username: loginFormData.username,
        password: loginFormData.password,
      }
    }).then(function (response:AxiosResponse<string>) {
      if (response.data.includes('success')) {
          props.children.setLoginStatus("loggedin");
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