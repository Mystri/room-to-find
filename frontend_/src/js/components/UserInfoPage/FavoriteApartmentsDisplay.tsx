import * as React from 'react';
import useUserInfo from '../../common/UseUserInfo';
interface UserInfoDisplayProps {
  
}
 
const FavoriteApartmentDisplay: React.FunctionComponent<UserInfoDisplayProps> = () => {
  
  const [userInfo, setUserInfo] = useUserInfo();

  return ( <div>
    {`Favourite Apartments`}

  </div> );
}
 
export default FavoriteApartmentDisplay;