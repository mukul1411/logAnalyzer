# logAnalyzer

# Real-Time Log Analysis with Spring Boot, Kafka & Spark

## 1. Overview
This project provides real-time log streaming, analysis, and anomaly detection using **Spring Boot**, **Apache Kafka**, **Spark Streaming**, and **Machine Learning**.

## 2. Components
- **Spring Boot Kafka Producer & Consumer**
- **REST API for Log Ingestion**
- **Spark Streaming for Log Analysis**
- **Anomaly Detection using ML**
- **Alerting via Slack**
- **Visualization with Grafana/Kibana**

## 3. Setup Instructions
### 3.1 Start Kafka
```sh
bin/zookeeper-server-start.sh config/zookeeper.properties
bin/kafka-server-start.sh config/server.properties
bin/kafka-topics.sh --create --topic logs-stream --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1
```

### 3.2 Run Spring Boot Application
```sh
mvn clean package
java -jar target/RealTimeLogAnalysis.jar
```

### 3.3 Send Logs via REST API
```sh
curl -X POST "http://localhost:8080/logs/send?message=High CPU Usage Detected"
```

### 3.4 Spark Streaming Job (Integration Needed)
- Connect Kafka to Spark Streaming for advanced log processing.

### 3.5 Dashboard Setup
- **Grafana**: Add MongoDB as a data source and visualize logs.
- **Kibana**: Use Elasticsearch for real-time monitoring.

## 4. Future Enhancements
- Add SMS alerts via Twilio
- Implement deep learning for anomaly detection
- Improve log classification models
