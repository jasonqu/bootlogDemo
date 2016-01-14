---
layout: index
title: Hello World!
category : index
tagline: "Supporting tagline"
tags : []
---

欢迎阅读[bootlog](https://github.com/jasonqu/bootlog)的快速上手说明，完整的使用说明和文档请参见[bootlog in github](https://github.com/jasonqu/bootlog)。
本示例的代码都保存在[bootlogDemo](https://github.com/jasonqu/bootlogDemo)项目中。

## bootlog是什么

bootlog是基于sbt、twirl、pegdown、bootstrap和bootflat创建的一个静态博客生成器，目标用户是scala、java以及github使用者。

## Update configuration

In `conf/blog.conf` remember to specify your own data:

    site.title : My Blog =)
    author : {
      name : Name Lastname
      email : "blah@email.test"
      github : username
      twitter : username
    }

The theme should reference these variables whenever needed.

## To-Do

A lot of job need to be done, including:

1. make play be able to compile md template smoothly so that the index page
2. make it easy to [generate static site](https://github.com/sbt/sbt-site) and [git pushing](http://github.com/sbt/sbt-ghpages)
3. add extra features like play-doc support
4. add examples

Any suggestion or contribution is welcome.

## Sample Posts

This blog contains sample posts which help stage pages and blog data.
When you don't need the samples anymore just delete the `_posts/core-samples` folder.

    $ rm -rf _posts/core-samples

Here's a sample "posts list".