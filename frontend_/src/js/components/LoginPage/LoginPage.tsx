import React from 'react';
import LoginBox from './LoginBox';
import { LoginStatus } from '../../types/frontend';

type LoginPageProps = {
  children: {
    setLoginStatus: (loginStatus: LoginStatus) => void;
  }
}

export default function LoginPage(props: LoginPageProps) {
  return <div><LoginBox children={props.children}/></div>
};