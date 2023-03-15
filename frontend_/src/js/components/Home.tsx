import React from 'react';

const axios = require('axios');

import LoginPage from './LoginPage/LoginPage';
import { LoginStatus, UserInfo } from '../types/frontend.js'

type HomeState = {
  loginStatus: LoginStatus
  userInfo: UserInfo | null;
}

type HomeProps = {

}

class Home extends React.Component<HomeProps, HomeState> {

  constructor(props:HomeProps) {
    super(props);
    this.state = {
      loginStatus: "loggedout",
      userInfo: null
    }
  }

  setLoginStatus: (loginStatus:LoginStatus) => void = (loginStatus:LoginStatus) => {
    console.log('setlogin');
    this.setState({
      ...this.state,
      loginStatus: loginStatus
    });
  }

  render() {
    switch (this.state.loginStatus) {
      case "loggedout":
        return <LoginPage children={{setLoginStatus:this.setLoginStatus}}/>;
      case "loggedin":
        return <div>logged in</div>
    }
  }
}

export default Home;
