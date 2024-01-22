def call() {
  sh 'rm -rf hello-world-war'
  sh 'git clone https://github.com/88janu/hello-world-war.git'
}
