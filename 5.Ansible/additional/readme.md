

```bash 
ansible-vault --help 

# filename: database-secret.yaml 
ansible-vault encrypt database-secret.yaml 
ansible-vault view database-secret.yaml 

# --ask-become-pass 
# -b , --become 

ansible-playbook -i inventory.ini  \
    test.yaml --ask-vault-pass


ansible-playbook -i inventory.ini  \
    test.yaml --ask-vault-pass
```
