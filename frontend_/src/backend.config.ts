export const port = 8081;
export const baseUrl = 'localhost';
export const fullUrl = (suffix:string) => `http://${baseUrl}:${port}${suffix}`;
