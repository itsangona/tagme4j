TagMe4J
=================

TagMe API client for Java applications

-- WIP


Examples
--------

Instanciate a TagMeClient with your token and execute a request:

```
TagMeClient tagMeClient = new TagMeClient("TOKEN");

TagResponse tagResponse = tagMeClient
                .tag()
                .text("My text")
                .execute();
                
SpotResponse spotResponse = tagMeClient
                .spot()
                .text("My text")
                .execute();
                
RelResponse relResponse = tagMeClient
                .rel()
                .tt("Linked_data Semantic_Web")
                .tt("University_of_Pisa Massachusetts_Institute_of_Technology")
                .tt("James_Cameron Downing_Street")
                .execute();
```

Developed By
--------

Enrico Candino - www.enricocandino.it

<a href="https://twitter.com/enrichmann">
  <img alt="Follow me on Twitter"
       src="http://icons.iconarchive.com/icons/danleech/simple/96/twitter-icon.png" />
</a>
<a href="https://plus.google.com/+EnricoCandino">
  <img alt="Follow me on Google+"
       src="http://icons.iconarchive.com/icons/danleech/simple/96/google-plus-icon.png" />
</a>
<a href="https://it.linkedin.com/in/enrico-candino-78995553">
  <img alt="Follow me on LinkedIn"
       src="http://icons.iconarchive.com/icons/danleech/simple/96/linkedin-icon.png" />
</a>


License
--------

    The MIT License (MIT)

    Copyright (c) 2015 Enrico Candino

    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:

    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    SOFTWARE.
    