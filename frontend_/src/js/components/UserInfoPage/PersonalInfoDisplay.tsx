import * as React from 'react';
import useUserInfo from '../../common/UseUserInfo';
interface UserInfoDisplayProps {

}

const PersonalInfoDisplay: React.FunctionComponent<UserInfoDisplayProps> = () => {
  const [userInfo, _] = useUserInfo();
  if (userInfo !== null) {

    return (
      <div>
        <div>{`Birthday ${userInfo.birthday}`}</div>
        <div>{`Gender ${userInfo.gender}`}</div>
        <div>{`Phone ${userInfo.mobilePhone}`}</div>
        <div>{`Email ${userInfo.email}`}</div>
        <div>Reset Password</div>
      </div>
    );
  } 
  return <div>userinfo is null</div>
}

export default PersonalInfoDisplay;