import React, { PropsWithChildren } from 'react';
import LoginBox, { LoginFormProps } from './LoginBox';

interface LoginPageProps extends LoginFormProps {
  
}

export default function LoginPage(props: PropsWithChildren<LoginPageProps>) {
  
  return <div><LoginBox {...props}/></div>
};