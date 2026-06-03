# 🚀 EVOLVE E-Commerce – Full Setup & CI/CD Guide 

A simple static e-commerce app built with Spring Boot, Maven, Docker, Jenkins, and Kubernetes.

## ✅ Step 1: Build with Maven
```bash
mvn clean package -DskipTests
```

## 🐳 Step 2: Docker Build & Push
```bash
docker build -t yourdockerhubusername/evolve-ecommerce .
docker login
docker push yourdockerhubusername/evolve-ecommerce
```

## ☸️ Step 3: Deploy to Kubernetes (NodePort)
```bash
kubectl apply -f deployment.yaml
kubectl apply -f service.yaml
```

## 🌐 Access App
- Home: `http://<node-ip>:30080/`
- Products API: `http://<node-ip>:30080/products`

## 🧪 Jenkins CI/CD Pipeline
- Make sure Jenkins has:
  - Docker installed and user added to `docker` group
  - `kubectl` installed and configured with kubeconfig
  - DockerHub credentials set as `dockerhub-creds`

- Example Jenkinsfile is already provided.

- trigger
