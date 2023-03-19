import React from 'react';
import '../css/App.css';
import Home from './components/Home';
import { Box } from '@mui/material';
import styled from '@emotion/styled';
import AppRoutes from './components/AppRoutes';
import { LoginStatus, UserInfo } from './types/frontend';

interface AppState {
  loginStatus: LoginStatus
  userInfo: UserInfo
}

interface AppProps {

}

class App extends React.Component<AppProps, AppState> {

  PageWrapper = styled(Box)({
    margin: 'auto 100px'
  })

  constructor(props: AppProps) {
    super(props);
    this.state = JSON.parse(localStorage.getItem('state'));
    this.setState = this.setState.bind(this);
  }

  componentDidUpdate(): void {
    localStorage.setItem('state', JSON.stringify(this.state));
  }

  render() {
    return (
      <this.PageWrapper>
        {JSON.stringify(this.state.userInfo)}
        <AppRoutes userInfo={this.state.userInfo} setState={this.setState} />
      </this.PageWrapper>
    );
  }
}

export default App;
