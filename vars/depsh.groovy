def call() {
 
      sh 'scp -r /root/.jenkins/workspace/Simple-WebApp-Deploy/target/*.war root@52.152.229.140:/root/tool/apache-tomcat-8.5.64/webapps/'
  
}