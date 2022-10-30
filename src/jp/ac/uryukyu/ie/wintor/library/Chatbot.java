package jp.ac.uryukyu.ie.wintor.library;

import javax.sound.midi.Soundbank;

public class Chatbot {
  String BotName;

  @Deprecated
  public Chatbot(){
    System.out.println("チャットボットの原型を作成します。");
  }

  public Chatbot(String _botname){
    this.BotName = _botname;
    System.out.println("チャットボット名nameを作成します。");
    System.out.println("BOT Name:" + this.BotName);
  }

  public void greeting(){
    System.out.println("はじめまして"+ this.BotName +"です、よろしくおねがいします");
  }

  public void setter(String _botname){
    if(_botname == "差別用語"){
      System.out.println("禁止されています");
    }
    else{
      System.out.println("ボット名を"+ this.BotName +"から"+ _botname + "へと変更します");
      this.BotName = _botname;
    }
  }
  
  public String getter(){
    return this.BotName;
  }
  
}
