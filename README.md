Implementated points - 
1] JWT token + Spring security based authorization.
2] Rapid API to get the Weather forecast summary of Any city using API
3] Rapid API to get hourly Weather forecast details of Any city using API


 1] Login and Authorization -
    url:-  http://localhost:8081/auth/login
    body:- {"username":"Vaibhav","password" :"Vaibhav123"}
    method type:- Get

    * use above url to login and to generate JWT token which can be furthur used for Authorization
    * In Memory user is with usename - "Vaibhav" and password -"Vaibhav123" is implemented for Authorization 


 2] Rapid API to get the Weather forecast summary of Any city using API 
    url:- http://localhost:8081/weather/forecast
    method type:- Get 
    PayLoad:-
       * Authorization -> type = Bearer token, 
                          token = Generated JWT token

       * Body -> { "city"     : your input,
                   "xRapidKey": your input,
                   "rapidHost": your input }
        
       Example -> { "city":"Delhi",
                    "xRapidKey":"8c12d231cbmshdbf24d597425000p1612c3jsn773152374a53",
                    "rapidHost":"forecast9.p.rapidapi.com"} 
       (The above body can be used as it is)     


 3] Rapid API to get hourly Weather forecast details of Any city using API
    url - http://localhost:8081/weather/hourlyforecast
    method type:- Get 
    PayLoad:-
       * Authorization -> type = Bearer token, 
                          token = Generated JWT token

       * Body -> { "city"     : your input,
                   "xRapidKey": your input,
                   "rapidHost": your input }
      (To use this API user need subscription. We need "xRpidKey" and "rapidHost" of subscribed user)
                        
