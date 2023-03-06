import React, { useState } from 'react';
import { styled } from "@mui/material/styles";
import TextField from '@mui/material/TextField';
import Button from '@mui/material/Button';
import { FormData } from '../types/frontend'

interface LoginFormProps {
  loginHandler: (formData: FormData) => void;
}


function LoginForm(props: LoginFormProps) {
  const [formData, setFormData] = useState({
    username:'',
    password:'',
  });

  const handleSubmit = (event: React.FormEvent<HTMLFormElement>) => {
    event.preventDefault();
    props.loginHandler(formData);
  };

  return (
    <form onSubmit={handleSubmit}>
      <TextField
        label="Username"
        value={formData.username}
        onChange={(event) => setFormData({...formData, username:event.target.value})}
      />
      <TextField
        label="Password"
        type="password"
        value={formData.password}
        onChange={(event) => setFormData({...formData, password:event.target.value})}
      />
      <Button variant="contained" color="primary" type="submit">
        Login
      </Button>
    </form>
  );
}

export default LoginForm;
