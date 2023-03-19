import React, { useContext, useEffect } from "react";
import { UserInfo } from "../types/frontend";
import { UserInfoContext } from "./Contexts";

export default function useUserInfo():[UserInfo, React.Dispatch<React.SetStateAction<UserInfo>>] {
  const [userInfo, setUserInfo] = React.useState<UserInfo>(null);
  const userInfoContext = useContext(UserInfoContext);
  useEffect(() => {
    setUserInfo(userInfoContext);
  }, []);

  return [userInfo, setUserInfo];
}