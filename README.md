# 

## Model
www.msaez.io/#/59447401/storming/hospital-appointment

## Before Running Services
### Make sure there is a Kafka server running
```
cd kafka
docker-compose up
```
- Check the Kafka messages:
```
cd infra
docker-compose exec -it kafka /bin/bash
cd /bin
./kafka-console-consumer --bootstrap-server localhost:9092 --topic
```

## Run the backend micro-services
See the README.md files inside the each microservices directory:

- appointment
- management
- payment
- boundedcontext1353


## Run API Gateway (Spring Gateway)
```
cd gateway
mvn spring-boot:run
```

## Test by API
- appointment
```
 http :8088/appointments id="id" appointmentId="appointmentId" patientId="patientId" doctorId="doctorId" appointmentDate="appointmentDate" status="status" createdAt="createdAt" updatedAt="updatedAt" symptom="symptom" 
```
- management
```
 http :8088/medicalInformations id="id" recordId="recordId" patientId="patientId" doctorId="doctorId" diagnosis="diagnosis" treatment="treatment" createdAt="createdAt" updatedAt="updatedAt" status="status" 
```
- payment
```
 http :8088/bills id="id" billId="billId" patientId="patientId" medicalRecordId="medicalRecordId" amount="amount" status="status" createdAt="createdAt" completionTime="completionTime" 
```
- boundedcontext1353
```
 http :8088/notifications id="id" notificationId="notificationId" patientId="patientId" message="message" createdAt="createdAt" status="status" 
```


## Run the frontend
```
cd frontend
npm i
npm run serve
```

## Test by UI
Open a browser to localhost:8088

## Required Utilities

- httpie (alternative for curl / POSTMAN) and network utils
```
sudo apt-get update
sudo apt-get install net-tools
sudo apt install iputils-ping
pip install httpie
```

- kubernetes utilities (kubectl)
```
curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"
sudo install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl
```

- aws cli (aws)
```
curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"
unzip awscliv2.zip
sudo ./aws/install
```

- eksctl 
```
curl --silent --location "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C /tmp
sudo mv /tmp/eksctl /usr/local/bin
```

