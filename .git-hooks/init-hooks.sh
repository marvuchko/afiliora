#!/bin/bash
set -e

# capture path
PWD=$(pwd)

###### Copy Pre-Push hook to `.git` hooks folder

if [ ! -f "$PWD/../.git/hooks/pre-push" ]; then
  echo "Creating Git Pre-Push hook...";
  cp "./pre-push" "$PWD/../.git/hooks/pre-push";
  echo "Git Pre-Push hook created successfully.";
fi

###### Assign permission to `pre-push` hook if on MacOS or Linux

if [ -f "$PWD/../.git/hooks/pre-push" ]; then
  	echo "Assigning permissions to Git Pre-Push hook...";
    chmod +x "$PWD/../.git/hooks/pre-push";
    echo "Permissions assigned successfully.";
fi
