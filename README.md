# Lurch
Lurch is a butler... Erm, wait! It's a REST service meant to be used with [Alfred](https://www.alfredapp.com/), in order to execute bash commands through it's custom web search.

![Image of Lurch](https://s3.amazonaws.com/rapgenius/Lurch_6.jpg)

Lurch was inspired by a script developed by a friend of mine, which can be found [here](https://github.com/brunetto/ambrogio).

## Requirements

In order to use Lurch in a correct way, you should have those tools installed:
- Java 1.8 
- iTerm 2
- Google Chrome

## Instructions

Download the jar file, under the [Releases](https://github.com/mfalcier/lurch/releases) tab.

After that, be sure that you don't have other services running on port `2309`, since Lurch it's using it.

Execute Lurch by launching the following command from a terminal:

`java -jar lurch-1.0.jar`

Next, open Alfred Preferences -> Features -> Web Search and then click on "Add Custom Search".

Fill the form using the following strings:
- Search URL: `http://localhost:2309/bash?q={query}`
- Encode spaces as: `+`
- Title: `Executing command '{query}'`
- Keyword: `bash`

You can now test the new search, and launch your bash commands like `bash ls -ltr` and your result will appear in a new iTerm2 window.
