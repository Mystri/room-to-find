import * as React from 'react';
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import { UserInfoContext } from "../common/Contexts"
import { LoginStatus, UserInfo } from "../types/frontend"
import LoginPage from "./LoginPage/LoginPage"
import Matching from "./MatchingPage/Matching"
import SearchPage from "./SearchPage/SearchPage"
import UserInfoPage from "./UserInfoPage/UserInfoPage"
import Home from './Home';

interface RoutesProps {
  userInfo: UserInfo
  setState: (newValue: Object) => void
}

const AppRoutes: React.FC<RoutesProps> = (props) => {
  return (
    <UserInfoContext.Provider value={props.userInfo}>
      <Router>
        <Routes>
          <Route path='/' element={<Home/>} />
          <Route path='/login'
            element={<LoginPage
              setLoginStatus={(loginStatus: LoginStatus) => { props.setState({ loginStatus: loginStatus }); }}
              setContextUserInfo={(userInfo: UserInfo) => { props.setState({ userInfo: userInfo }); }}
            />}
          />
          <Route path="/search" element={<SearchPage />} />
          <Route path="/matching" element={<Matching />} />
          <Route path="/user" element={<UserInfoPage />} />
        </Routes>
      </Router>
    </UserInfoContext.Provider>
  );
}

export default AppRoutes;