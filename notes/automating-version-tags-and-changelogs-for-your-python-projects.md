# Automating Version Tags and Changelogs for your Python Projects

## Automating Version Tags and Changelogs for your Python Projects <a href="#36d2" id="36d2"></a>

### A hands-on guide to automating version tags and changelogs based on your project’s commit history with commitizen <a href="#f4cb" id="f4cb"></a>

![](https://miro.medium.com/max/700/0\*HB-b9xGizBMEBcbx)Photo by [Yancy Min](https://unsplash.com/@yancymin?utm\_source=medium\&utm\_medium=referral) on [Unsplash](https://unsplash.com/?utm\_source=medium\&utm\_medium=referral)

Tired of keeping track of whether your code changes warrant a minor or major version increment? Too busy to keep a neat and tidy changelog? Try using [commitizen](https://commitizen-tools.github.io/commitizen/), a command-line utility that “forces” you to write commit messages following the [Conventional commits](https://www.conventionalcommits.org/en/v1.0.0/) standard (or a different, user-defined format). Once configured, commitizen will bump the semantic versioning of your code automatically based on your commits, and update your changelog.

### Configuration <a href="#6f3f" id="6f3f"></a>

Commitizen is configured in five simple steps. First, you need to install commitizen:

```
pip install commitizen
```

Second, add a reference to your code’s current version number to your `__init__.py` file, or add a separate `__version__.py` file as shown below:

Third, update your `.pre-commit-config.yaml` to include a pre-commit hook for commitizen (if you’re unfamiliar with pre-commit hooks, [check out my earlier blog post on using pre-commit hooks for improving code style](https://python.plainenglish.io/how-to-improve-your-python-code-style-with-pre-commit-hooks-e7fe3fd43bfa)):

Fourth, update your `pyproject.toml` file to include commitizen, which references the current version of your code as well as other locations in your code where the version needs to be updated upon a commit (such as your `setup.py` file):

Finally, run `pre-commit install --hook-type commit-msg` to set up the commitizen pre-commit hook.

### Using commitizen in your git workflow <a href="#7120" id="7120"></a>

Now that we’ve installed and configured commitizen, let’s take a look at its use in your git workflow.

Let’s assume you’ve checked out a new (feature) branch and you’ve made some changes that you’d like to commit. Instead of using the conventional `git commit '<commit-message>'` command after adding (un)tracked files, we use the `commitizen commit` command (or `cz c` in short). Using this command will prompt a bunch of options:

![](https://miro.medium.com/max/700/1\*n0A59BKP1MHyBsdYIZGPBg.png)Different commit options for your commit upon using “cz c” (image by author)

Use the selection menu to classify the kinds of changes you’ve made (e.g. a bug fix, or a new feature), and add a commit message when prompted to do so. This will prefix the commit message with the selected code change classification (e.g. `feat` or `fix`). For example, if you’ve added a new feature, the commitizen-generated commit message may look as follows:

```
doc: update README
```

After you’ve made your commit and pushed your branch, registered a PR, and merged to master (or “main”), check out the master branch and run:

```
cz bump --check-consistency --changelog
```

This will check the consistency of the versions in your commitizen configuration (and code), and generate or update a changelog (see [here](https://github.com/ngoet/es\_demo/blob/main/CHANGELOG.md) for an example of a commitizen-based changelog). Subsequently, run the following commands to update the changelog and version references on your branch, and push the new version tag:

```
git pushgit push --tags
```

And that’s it — now you’re all set up for automated version and changelog bumps for your Python project based on your commit history. Thanks for reading!

_P.s. if this all went a bit too fast, have a look at_ [_this repo_](https://github.com/ngoet/es\_demo) _I set up for a_ [_different blog post_](https://medium.com/@ndgoet)_, where I’ve used commitizen for versioning._

\
