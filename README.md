mvn clean package
docker build -t spring-kubernetes-oomkilled-tutorial:latest .
kubectl apply -f deployment.yaml

kubectl get pods -w

Go to
http://localhost:8080/test
http://localhost:8080/consume-memory

Then
kubectl delete service memory-hog-service
kubectl delete deployment memory-hog-deployment
kubectl delete pv heapdump-pv
kubectl delete pvc heapdump-pvc

kubectl delete all -l app=memory-hog


