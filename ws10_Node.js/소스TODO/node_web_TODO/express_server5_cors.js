const express = require("express")
const path = require("path")
const app = express()  
const cors //TODO 

app.//TODO //모든 접근 허용 

app.set('port', process.env.PORT || 3020);

app.get("/students", (req,res) =>  {  
  //TODO ("Access-Control-Allow-Origin", "*"); // 모든 도메인 허용
  //res.header("Access-Control-Allow-Origin", "http://127.0.0.1:5500/"); // 특정 도메인 허용
 
  // res.header('content-type', 'application/json')
  return //TODO (__dirname, './db/data.json'));

});

app.listen(app.get('port'), () => {
  console.log(app.get('port'), '번 포트에서 대기 중');
});
