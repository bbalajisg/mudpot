# Fabric

```text
from fabric.api import env, run, roles, task, execute

def init_env():
    env.user = 'ubuntu' # Fabric will ssh into remote using this user
    env.use_ssh_config = True # Fabric will use ssh config to ssh.
    env.timeout = 30 # ssh attempt will fail after 30 secs
    env.connection_attempts = 4
    env.parallel = True # A task will be executed simaltaneously on all servers
    env.roledefs = LazyDict({ # Role that a remote server has.
        'deployment': lambda: []
    })

@task
@roles('deployment')
def update_code():
    print("Updating code.")
    run("""
      # Add your deployment script here
      # You can create multiple tasks in order to:
      # - Update dependencies
      # - Start the application
      # - restart your service
      # - Warmup the service in case its required
      # All it need is to create multiple functions like this
      # and execute them sequentially.
    """)

# Start deployment instance
deployemnt_instance = start_deployment_instance()
# Initialize fabric env
init_env()
# Add deployment instance ip/hostname to deployment role
env.rolesdef['deployment'].append(deployment_instance.public_ip)

# update code on deployment instances
execute(update_code)
# execute(update dependencies)
# execute(service_restart)
# execute(validate_service)
# execute(warmup_service)
```

