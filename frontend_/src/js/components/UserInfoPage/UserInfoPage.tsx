import React, { useState, useEffect, useContext } from 'react';
import UserInfoOptions from './UserInfoOptions';
import PersonalInfoDisplay from './PersonalInfoDisplay';
import FavoriteApartmentDisplay from './FavoriteApartmentsDisplay';
import FriendsDisplay from './FriendsDisplay';
import { UserInfo } from '../../types/frontend';
import axios from 'axios';
import { fullUrl } from '../../../backend';
import { UserInfoContext } from '../../common/Contexts';

interface UserInfoPageProps {

}

const UserInfoPage: React.FunctionComponent<UserInfoPageProps> = () => {

  const [selected, setSelected] = useState<'PersonalInfo'|'FavoriteApartments'|'FriendsDisplay'>('PersonalInfo');

  let selectedDisplay;
  if (selected === 'FavoriteApartments') {
    selectedDisplay = <FavoriteApartmentDisplay/>;
  } else if (selected === 'FriendsDisplay') {
    selectedDisplay = <FriendsDisplay/>
  } else if (selected === 'PersonalInfo') {
    selectedDisplay = <PersonalInfoDisplay/>
  }

  return ( 
    <div style={{display:'flex'}}>
      <UserInfoOptions setSelected={setSelected}></UserInfoOptions>
      {selectedDisplay}
    </div> 
  );
};

export default UserInfoPage;