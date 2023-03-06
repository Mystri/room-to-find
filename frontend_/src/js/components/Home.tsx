import React from 'react';

const axios = require('axios');

import backendConfig from '../../backend.config';
import Login from './Login';
import { FormData, UserInfo } from '../types/frontend.js'

interface HomeState {
  loginStatus: "loggedin" | "loggedout" | "neverloggedin" | "loginfailed";
  userInfo: UserInfo | null;
}

interface TodoProps {

}

function loginHandler(formData: FormData) {
  return;
}

class Home extends React.Component<TodoProps, HomeState> {

  constructor(props:TodoProps) {
    super(props);
    this.state = {
      loginStatus: "loggedout",
      userInfo: null
    }
  }

  render() {
    switch (this.state.loginStatus) {
      case "loggedout":
        return <Login loginHandler={loginHandler}/>;
      case "loggedin":
        return <div>logged in</div>
    }

  }
}

export default Home;
