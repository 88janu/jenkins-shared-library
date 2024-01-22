def call() {
  sh " nohup timeout 10s java -jar target/bus-booking-app-1.0-SNAPSHOT.jar >output.log 2>&1 &"
  sleep 10
}
