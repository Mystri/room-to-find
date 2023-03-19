export interface LoginFormData {
  username: string;
  password: string;
}

export interface UserInfo {
  userId:number,
  userName: string,
  email: string,
  mobilePhone: number,
  birthday: Date,
  gender: string,
}


type LoginStatus = "loggedin" | "loggedout" | "neverloggedin" | "loginfailed";
