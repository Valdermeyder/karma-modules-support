# karma-modules-support
Repo to reproduce karma failing when lazy loading is used

# Issue
Karma throws "Exception: Error: shadow.loader API was called before shadow.loader.init!" when `shadow.lazy` modules are used inside tested function

# Steps to reproduce the issue
1. `npm install`
1. `npx shadow-cljs compile test`
1. `npx karma start --single-run`
