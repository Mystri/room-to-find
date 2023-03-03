import React from 'react';

const axios = require('axios');

class Home extends React.Component {
  // componentDidMount() {
  //   axios.get('localhost:8080/').then((resp) => {
  //     console.log(resp.data);
  //   });
  // }

  render() {
    return (
      <div style={{ height: '200px', width: ' 200px' }}>
        home
      </div>
    );
  }
}

export default Home;
