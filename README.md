Use below url to generate jwt token
    http://localhost:8081/auth/login
    body-> {"username":"Vaibhav","password" :"Vaibhav123"}
    method type - post

Urls to get weather forecast
http://localhost:8081/weather/forecast
http://localhost:8081/weather/hourlyforecast
  method type - get (for both urls)
  PayLoad -
       * Authorization -> Bearer token
       * Body -> { "city": your input,
                   "xRapidKey": your input,
                   "rapidHost": your input }
                        
