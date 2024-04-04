@REM for /F "tokens=2 delims=:" %%i in ('"ipconfig | findstr IP | findstr 192."') do SET LOCAL_IP=%%i
@REM SET LOCAL_IP=%LOCAL_IP:~1%
@REM SET PORT = ":3000"
@REM  SET MONGO_URL=mongodb+srv://public:gaBWAiIhUo2r1Dx2@cluster0.pvrnowq.mongodb.net/MongoCloudProyect_SIS_414?retryWrites=true^&w=majority
SET MONGO_URL=mongodb+srv://public:tRbSsj4fK7ZKtXj5@cluster0.kmhn7b9.mongodb.net/sis414_test?retryWrites=true^&w=majority
@REM meteor run --port %LOCAL_IP%:3000

meteor run --port 3000