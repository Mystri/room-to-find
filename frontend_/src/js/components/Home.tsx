import React from 'react';

const axios = require('axios');

import { LoginStatus, UserInfo } from '../types/frontend.js'
import AppRoutes from './AppRoutes';

interface HomeState {
}

interface HomeProps {

}


class Home extends React.Component<HomeProps, HomeState> {

  constructor(props: HomeProps) {
    super(props);
  }

  render() {
    return (
      <div>
        Home
      </div>
    );
  }
}

export default Home;
