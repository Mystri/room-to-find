import React from 'react';

const axios = require('axios');

import backendConfig from '../../backend.config';

class Home extends React.Component {

  render() {
    return (
      <form>
        <label>
          Name:
          <input type="text" name="name" />
        </label>
        <input type="submit" value="Submit" />
      </form>
    );
  }
}

export default Home;
