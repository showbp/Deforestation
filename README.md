打包jar文件运行

sudo yum install java-11-amazon-corretto.x86_64 -y

sudo yum install maven -y

alternatives --config java

java -jar target/flink-random-cut-forest-example-1.0.jar
