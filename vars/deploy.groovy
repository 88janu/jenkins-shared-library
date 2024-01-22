def call() {
  sh 'scp /home/slave1/workspace/exp-17/target/hello-world-war-1.0.0.war root@172.31.6.180:/opt/apache-tomcat-8.5.98/webapps'
}
