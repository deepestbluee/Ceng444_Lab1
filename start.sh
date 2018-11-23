#!/usr/bin/env bash

antlr4 XPLNLexer.g4
antlr4 XPLNParser.g4
javac XPLN*.java

