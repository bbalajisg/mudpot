# Page

Environment setup



```
brew install warrensbox/tap/tfswitch
brew install awscli
brew install --cask font-jetbrains-mono
brew install --cask warp
brew install zoxide
brew install session-manager-plugin
brew install zsh-autocomplete
brew install zsh-autosuggestions
brew install fd
brew install base64
```





```
export PATH="${KREW_ROOT:-$HOME/.krew}/bin:$PATH"
export PATH="/usr/local/bin:$PATH"

export LC_ALL=en_US.UTF-8
export LANG=en_US.UTF-8
# User specific environment and startup programs

ssh-add -D
eval "$(ssh-agent -s)"
ssh-add -k ~/keys/private_key.pem  > /dev/null 2>&1


source /usr/local/share/zsh-autocomplete/zsh-autocomplete.plugin.zsh
source /usr/local/share/zsh-autosuggestions/zsh-autosuggestions.zsh
eval "$(zoxide init zsh)"

() {
   local -a prefix=( '\e'{\[,O} )
   local -a up=( ${^prefix}A ) down=( ${^prefix}B )
   local key=
   for key in $up[@]; do
      bindkey "$key" up-line-or-history
   done
   for key in $down[@]; do
      bindkey "$key" down-line-or-history
   done
}
```



