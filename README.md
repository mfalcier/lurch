# Lurch
Lurch is a butler... Erm, wait! It's a REST service meant to be used with [Alfred](https://www.alfredapp.com/), in order to execute bash commands through it's custom web search.

![Image of Lurch](https://s-media-cache-ak0.pinimg.com/564x/88/e9/ac/88e9ac65a9c43f9e944fd5c433d6a551.jpg)

Lurch was inspired by a script developed by a friend of mine, which can be found [here](https://github.com/brunetto/ambrogio).

## Requirements

In order to use Lurch in a correct way, you should have those tools installed:
- Java 1.8 
- iTerm 2
- Google Chrome

## Instructions

Download the jar file, under the [Releases](https://github.com/mfalcier/lurch/releases) tab.

After that, be sure that you don't have other services running on port `2309`, since Lurch is using it.

Execute Lurch by launching the following command from a terminal:

`java -jar lurch-1.0.jar`

Next, open *Alfred Preferences -> Features -> Web Search* and then click on "Add Custom Search".

Fill the form using the following strings:
- Search URL: `http://localhost:2309/bash?q={query}`
- Encode spaces as: `+`
- Title: `Executing command '{query}'`
- Keyword: `bash`

You can now test the new search, and launch your bash commands like `bash ls -ltr` and your result will appear in a new iTerm2 window.

## How it works

Lurch works in a clean way, just using App that you usually run on your own. That's why it acts like a real butler! :smirk:

* A HTTP call is made by Alfred to Lurch's endpoint, through your default browser (Chrome!)
* Lurch will run the passed bash command into an Apple Script
* The Apple Script will open a new iTerm2 window, launching your command
* Lurch returns a javascript in the response that will close the Chrome tab

Unfortunately I can't close a Firefox tab that way, since we're not its owner, that's why Chrome is the "chosen one".