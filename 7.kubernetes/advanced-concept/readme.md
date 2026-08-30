## NOTE FOR TAINTS , TOLERATION ,  AFFINITY,  ANTI-AFFINITY 

```bash 
kubectl get node 
kubectl describe node master01 # search on taints 
kubectl describe node worker01  

# TAINT , UNTAINT MASTER NODE 
# to untaint the node 
kubectl taint nodes master01  node-role.kubernetes.io/control-plane-

kubectl taint nodes master01  node-role.kubernetes.io/control-plane=:NoSchedule




#TAINT WORKER NODE 
kubectl taint nodes worker01 service=disabled:NoSchedule
# REMOVE TAINTS (UNTAINT)
kubectl taint nodes  worker01 service-

```