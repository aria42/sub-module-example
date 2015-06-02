This is an example of using git sub-modules for source dependencies where you expect frequent upstream contributions. It's a 1-file project that uses sub-modules and has a source dependency on `allenai/common` under `deps/common`. Effectively the sub-module points to a fixed sha of that project. You can edit common files and run the parent project without having to re-publish artifacts and do that whole dance during development.

However, when you want to PR your changes, if you made a change to the sub-module project during dev you need to first get those changes on the upstream repo and then point the parent sub-module at the updated SHA for `allenai/common`.

## How to use

When you clone a repo with sub-modules, you want to use `git clone --recursive` which will check out all the sub-modules.

## Sym-linked Files

Because `allenai/common` uses plugins and some other features, this project has to sym-link files from `allenai/common`. This is really due to SBT shittyness in how they don't fork for sub-projects, but it's actually avoidable if someone wants to refactor the build of `allenai/common` a little. 
