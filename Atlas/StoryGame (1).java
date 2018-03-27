import java.util.Scanner;

public class StoryGame{
  public static void main(String[] args) {
    System.out.println("Atlas, a kingdom as old as mankind, filled with peace and prosperity for more than a million of years. That is until the king of the empire died. The kingdom was broken and due to the fact that the king had not had any heirs. The kingdom fell into the heart of corruption and the power struggle put a scar in the kingdoms history. This is the story of the fall or revival of Atlas, there only hope is you… \n Which faction do you desire? \n Priesthood(1), Sorcerers(2) or Nobility(3)");
    Scanner input = new Scanner(System.in);
    int position = input.nextInt();
    switch(position){
      case 1:
      System.out.println("\n\n\n\nThe Priesthood is the faction that believes that god will chose the right path. \n The leader of this faction is Minos, the head priest. They have high morals and rituals.\n They seek for the good of the kingdom rather than the good of the people. \n");
      System.out.println("\n\n\n\nCivilian: High priest, please come outside quick, the king is dead! \n Minos: I am coming \n (You rush to the kings chamber room) \n General: It seems the king is dead, we will take it from here \n Minos: That is up to the gods to decide you can take no part in this. \n General: How dare you raise your voice at me! Guards arrest him for treason! \n Civilian: Run before they take you prisoner high priest \n (You rush out of the kings chamber room and go to the temple) \n\n Minos: \n We have to leave! (1) \n Lets stay and fight! (2) ");
      int Choice = input.nextInt();
      if (Choice == 1){
        System.out.println("\n\n\n\n\nMinos: We have to leave and protect ourselves or we will be killed! \n Other Priest: Yes lets get to safety and decide for a way to retaliate \n Minos Flees with the other priests \n\n Where should Minos go? \n Civilians Home (1) \n  Mountains (2)");
        int A = input.nextInt();
        if (A == 1){
          System.out.println("\n\n\n\nMinos: Lets hide at civilians house! \n Other Priests: It isn’t a wise decision but we have to make these rash decisions in the time of need\n After 2 Months\n Many priests were discovered by the army when searching peoples house. You endangered peoples lives and the people caught harboring priests were executed but hard times call for desperate measures.\n Minos: It is no longer safe we must head to the mountains or we can plan and assassination attempt today\n\n What will you do?\n Stage a rebellion(1)\n Go to the Mountains(2)");
          int B = input.nextInt();
          if (B == 1){
            System.out.println("\n\n\n\nYou should have been aware of the consequences of your action. By going into battle unprepared you have died in the battle! Try to look for clues in the passage next time and you will get farther in the story. \n\nPress '0' to restart");
          } else if (B == 2) {
            System.out.println("\n\n\n\nMinos: We have to head to the mountains \n Other Priest: Yes lets leave \n (Minos Flees into the mountains)\n After 2 Months\n Minos: We have got the alliance with the local mountain men and the bandits, it is the time to attack!\n\nWho should we ally with for the fight? (Only can pick one)\n Mountain men(1)\n Bandits(2)");
            int C = input.nextInt();
            if (C == 1){
              System.out.println("\n\n\n\nMinos: Lets fight alongside the mountain men\n Other Priests: That seems like a potential success\n Mountain men: Just say a word and we will lay our lives for you! \n\nTactis: \n Take the river road(1) \n Ambush in the dead of night(2)");
              int D = input.nextInt();
              if (D == 1){
                System.out.println("\n\n\n\nMinos: Lets attack the troops that are passing below us \nYou successfully take the boat and take the clothes of the soldiers. Now you could disguise as guards and enter the castle. \n\nWhat will you do? \nPass through the land and get the help of a neighboring king (1) \nAttack at night (2) ");
                int E = input.nextInt();
                if (E == 1){
                  System.out.println("\n\n\n\nMinos: Your majesty I have come in the intentions of asking for a favor.\nAesop(King of Helios): You have some courage coming for my help! You attacked us just a few years ago! Either you are not in the right mind or desperate.\nMinos: We have come for your help because we need to take back our land from a tyrant king.\nAesop: What will I get out of this?\nMinos: A alliance for 100 years and prosperity\nAesop: Do you take me for a fool?!?Aesop: Peace and prosperity is for those who are cowards and aren’t ready for the hardships of war! I won’t profit from peace!\nMinos: I have come in peace and will leave if I must!\nAesop: Guards escort these men out of my kingdom!\nSoldier: You heard the king! Move now!\n\nWhat do you want to do?\nTry persuading the king again (1)\nLeave the land(2)");
                  int F = input.nextInt();
                  if (F == 1){
                    System.out.println("\n\n\n\nMinos: I am your audience and you have to grant me my wishes. That is the duty of a true king!\nYOU ARE DEAD\nYou tried to convince the king but after three attempts, the king is tired of your quarrels and decides to execute you. Try to look for clues in the passage next time and you will get farther in the game.");
                  } else if (F == 2){
                    System.out.println("\n\n\n\nMinos: Fine I will go but the war you desire might already be brewing!\nMinos and his men leave the kingdom of Helios and head back to the mountain.\nMountain Men: What are we going to do now?\n\nWhat do you want to do?\nWait for a year(1)\nPlan a assassination in Atlas(2)");
                    int G = input.nextInt();
                    if (G == 1){
                      System.out.println("\n\n\n\nYou waited too long and because of your idea of telling the Aesop about what is happening in your kingdom, Aesop plans an attack and plunders Atlas. This is the story of the fall of Atlas.");
                    } else if (G == 2){
                      System.out.println("\n\n\n\nMinos: Tonight is the right time to attack Atlas. This is our golden opportunity, if we miss it we would never be able to revolt again.\nMountain Men: You are right Minos, lets attack tonight\n\nHow do you want to attack?\nKill the royals(1)\nConvince the guards(2)");
                      int H = input.nextInt();
                      if (H == 1){
                        System.out.println("\n\n\n\nMinos: Lets attack the royals, we might not get another chance like this ever again!\nMinos and the men go into the royal chamber. \n\nWhat would you do?\nKill all the royals(1)\nKill only the men(2)");
                        int I = input.nextInt();
                        if (I == 1){
                          System.out.println("\n\n\n\nMinos: Lets kill all the royals! \n Mountain men: Is that really wise Minos? There are woman and children \n Minos: Anything is fair in war \n (Minos and the men slaughter the families) \n\nWhat do you want to do now?\nSeize the Throne(1)\nGive the power to the Mountain Men(2)");
                          int J = input.nextInt();
                          if (J == 1){
                            System.out.println("\n\n\n\nRESOLUTION: \n Your time of tyranny will end when the neighboring kingdom - Helios - hears about the terrors happening in your kingdom. Wanting to acquire Atlas, the king of Helios kill you and take the kingdom for himself. His rule was merciful, giving the scraps of food left to the people of Atlas. Atlas enters a 100 years of oppression...");
                          } else if (J ==2){
                            System.out.println("\n\n\n\nRESOLUTION: \n You leave the kingdom to the Mountain Men to rule but when a neighboring kingdom - Helios - hears about whats happening in your kingdom. Wanting to acquire Atlas, the king of Helios kill you and take the kingdom for himself. His rule was merceful, giving the scraps of food left to the people of Atlas. Atlas enters a 100 years of oppression...");
                          }
                        } else if (I == 2){
                          System.out.println("\n\n\n\nMinos: Lets kill only the men! \n Mountain men: That is a serious decison but it is better than killing off all royals\n(Minos and the men slaughter the men) \n\nWhat do you want to do now?\nSeize the Throne(1)\nGive the power to the Mountain Men(2)");
                          int J = input.nextInt();
                          if (J == 1){
                            System.out.println("\n\n\n\nRESOLUTION: \n You seize the throne of Atlas but your rule didn't last that long. After a year of acquiring the throne, you were slaughtered in your house by a son of the royals. Atlas falls into chaos and the kingdom went up in flames.");
                          } else if (J ==2){
                            System.out.println("\n\n\n\nRESOLUTION: \n The mountain men were merciful rulers, taking care of the citizens like thier own. They enter into an era of prosperity and Atlas is recognized as one of the greatest kingdoms of all time.");
                          }
                        }
                      } else if (H == 2){
                        System.out.println("\n\n\n\n");
                      }
                    }
                  }
                } else if (E == 2){

                }
              } else if (D == 2){
                System.out.println("Minos: Lets ambush at the dead of night\nMountain men: That isn’t an honorable way to fight but we do what we must do!\nMinos: Thank you men\nOther Priest: When should we attack?\nMinos: Tonight is the right time to attack!\n(That night inside the castle)\n\nWhat should the men do?\nKill the noble(1)\nConvince some soldiers to join their side(2)");
                int E = input.nextInt();
                if (E == 1){

                } else if (E == 2){

                }
              }
            } else if (C == 2){
              System.out.println("\n\n\n\nMinos: Lets fight alongside the northern Bandits \nOther Priests: That could end badly \nBandits: Just say a word and we are with you!\n\nTactis:\nTake the river road(1) \nAmbush in the dead of night(2)");
              int D = input.nextInt();
              if (D == 1){

              } else if (D == 2){
                System.out.println("\n\n\n\nMinos: Lets ambush at the dead of night\nBandits: It is the right way to attack!\nMinos: Thank you men\nOther Priest: When should we attack?\nMinos: Tonight is the right time to attack!\n(That night inside the castle)\n\nWhat should the Bandits do?\nKill the noble(1)\nConvince some soldiers to join their side(2)");
                int E = input.nextInt();
                if (E == 1){
                  System.out.println("\n\n\n\n");
                } else if (E == 2){
                  System.out.println("\n\n\n\nMinos: Lets try to convince the guards and make them join us!\nBandits: That could end badly for us! But we will do it!\nMinos: Thank you men\nMinos: You are the soldier I trust inside the castle, are there any one loyal to our command\nSoldier: Some in the castle follow me\n\nWhat will you do?\nFollow the Guard(1)\nDon’t trust the Guard(2)");
                  int F = input.nextInt();
                  if (F == 1){
                    System.out.println("\n\n\n\nYou trusted the guard but the guard wasn’t loyal to you. So he led you to an ambush in the kings chambers. Try to look for clues in the passage next time and you will get farther in the game.");
                  } else if (F == 2){
                    System.out.println("\n\n\n\nMinos: Sorry but the last time I trusted you, you warned the king.\nSoldier: How dare you question my loyalty? \n(You grab the soldier by his collar)\n\nWhat will you do?\nInterrogate the Soldier(1)\nKill the Soldier(2)");
                    int G = input.nextInt();
                    if (G == 1){
                      System.out.println("\n\n\n\nMinos: Men do what you are good at!\n(Soldier is interrogated by the bandits)\nSoldier: Please stop! Everyone is in the banquet hall waiting for you to come. So they could get rid of you!\nMinos: How do they know I am coming to attack?\nSoldier: One of the people in your pack is a rat feeding information to the king and his soldiers!\n\nShould you listen to his words? \nYes (1)\nNo (2)");
                      int H = input.nextInt();
                      if (H == 1){
                        System.out.println("\n\n\n\nMinos: Who among you is a rat?\nOther priests: We are not a rat!\n\nDo you want to interrogate your fellow priest to find out the information?\nYes\nNo");
                        int I = input.nextInt();
                        if (I == 1){
                          System.out.println("\n\n\n\nMinos: Fellow Bandits, I don’t trust my priest brothers! Interrogate them to get the answer out of them!\n(Bandits interrogate the priests)\nThe priest respect and trust for you have went down because of your actions\nArnold: I was the rat, please forgive me\n\nDo you want to forgive him?\nForgive him(1)\nKill him(2)");
                          int J = input.nextInt();
                          if (J == 1){
                            System.out.println("\n\n\n\nMinos: You are forgiven but don’t defy me again!\nArnold: I am sorry\nThe members ask you what they should do, you tell them to check inside the banquet hall through the back entrance quietly. They search and come back…\nBandits: There is no one there!\nMinos: How dare you lie to me you traitor!\nSoldier: They were right there just a second ago!\n");
                          } else if (J == 2){
                            System.out.println("\n\n\n\nMinos: Kill the traitor!\n(Bandits kill Arnold)\n All the priest have decided that you are power hungry and leave you on your own.\nMinos: Lets kill the royals\n(You go to the royals room and learning that they are in the banquet hall)\n\n What do you want to do?\nDetonate the banquet hall(1)\nComeback another day(2)");
                            int K = input.nextInt();
                            if (K == 1){
                              System.out.println("\n\n\n\nMinos: Detonate the banquet hall \nBandits: Wise choice, Minos\n(You blow up the banquet hall)\n\nWhat do you want to do now?\nSeize the Throne(1)\nGive the power to the Mountain Men(2)");
                              int L = input.nextInt();
                              if (L == 1){
                                System.out.println("\n\n\n\nRESOLUTION: \n Your time of tyranny will end when the neighboring kingdom - Helios - hears about the terrors happening in your kingdom. Wanting to acquire Atlas, the king of Helios kill you and take the kingdom for himself. His rule was merciful, giving the scraps of food left to the people of Atlas. Atlas enters a 100 years of oppression...");
                              } else if (L ==2){
                                System.out.println("\n\n\n\nRESOLUTION: \n You leave the kingdom to the Mountain Men to rule but when a neighboring kingdom - Helios - hears about whats happening in your kingdom. Wanting to acquire Atlas, the king of Helios kill you and take the kingdom for himself. His rule was merceful, giving the scraps of food left to the people of Atlas. Atlas enters a 100 years of oppression...");
                              }
                            } else if (K == 2){
                              System.out.println("\n\n\n\nMinos: Lets gather man and comeback with a stronger troops.\nPress 1 to Continue");
                              int L = input.nextInt();
                              if (L == 1){
                                System.out.println("\n\n\n\nRESOLUTION: \n You waited too long and because of that a kingdom called Helios plans an attack and plunders Atlas. This is the story of the fall of Atlas.");
                              } else if (I == 2){

                              }
                            }
                          }
                        }
                      } else if (H == 2){
                        System.out.println("\n\n\n\nMinos: I know who my men are and I wouldn’t listen to your sly words!\nThe priest and bandits acknowledge your trust and compassion\nOther Priests: After this we are willing to let down our lives for you!\nMinos: With that said, tie up the soldier so no one can hear him\nYou and your men march down the side of the banquet. There is an army of at least one thousand. Then you hear a cry to arms behind you. You are filled with confusion and don’t understand what has happened.One of the men approach you and says\nStranger: Minos we knew you would return and our hopes haven’t died.\nMinos: I am thankful for your passion but how will we defend a army with my men and a handful of your men?\nStranger: We can either try stealth attack or we can go to straight combat which would you prefer?\n\nWhat would you do?\nStealth (1)\nCombat (2)");
                        int I = input.nextInt();
                        if (I == 1){
                          System.out.println("\n\n\n\n");
                        } else if (I == 2){
                          System.out.println("\n\n\n\nRESOLUTION: \n Your bravery and passion for the people has been displayed by this battle, you successful restore power to the church and become a loyal servant to the people. The people praise you for battle tactic and plead for you to take place of a new king. You accept though it will never be as glorious as the times before, Atlas persevered and the people prosperous.");
                        }
                      }
                    } else if (G == 2){
                      System.out.println("\n\n\n\n");
                    }
                  }
                }
              }
            }
          }
        } else if (A == 2){
          System.out.println("\n\n\n\nMinos: We have to head to the mountains\nOther Priest: Yes lets leave\n(Minos Flees into the mountains)\nAfter 2 Months\nMinos: We have got the alliance with the local mountain men and the bandits, it is the time to attack!\n\nWho should we ally with for the fight? (Only can pick one)\nMountain men(1)\nBandits(2)");
          int C = input.nextInt();
          if (C == 1){
            System.out.println("\n\n\n\nMinos: Lets fight alongside the mountain men\n Other Priests: That seems like a potential success\n Mountain men: Just say a word and we will lay our lives for you! \n\nTactis: \n Take the river road(1) \n Ambush in the dead of night(2)");
            int D = input.nextInt();
            if (D == 1){
              System.out.println("\n\n\n\nMinos: Lets attack the troops that are passing below us \nYou successfully take the boat and take the clothes of the soldiers. Now you could disguise as guards and enter the castle. \n\nWhat will you do? \nPass through the land and get the help of a neighboring king (1) \nAttack at night (2) ");
              int E = input.nextInt();
              if (E == 1){
                System.out.println("\n\n\n\nMinos: Your majesty I have come in the intentions of asking for a favor.\nAesop(King of Helios): You have some courage coming for my help! You attacked us just a few years ago! Either you are not in the right mind or desperate.\nMinos: We have come for your help because we need to take back our land from a tyrant king.\nAesop: What will I get out of this?\nMinos: A alliance for 100 years and prosperity\nAesop: Do you take me for a fool?!?Aesop: Peace and prosperity is for those who are cowards and aren’t ready for the hardships of war! I won’t profit from peace!\nMinos: I have come in peace and will leave if I must!\nAesop: Guards escort these men out of my kingdom!\nSoldier: You heard the king! Move now!\n\nWhat do you want to do?\nTry persuading the king again (1)\nLeave the land(2)");
                int F = input.nextInt();
                if (F == 1){
                  System.out.println("\n\n\n\n");
                } else if (F == 2){
                  System.out.println("\n\n\n\nMinos: Fine I will go but the war you desire might already be brewing!\nMinos and his men leave the kingdom of Helios and head back to the mountain.\nMountain Men: What are we going to do now?\n\nWhat do you want to do?\nWait for a year(1)\nPlan a assassination in Atlas(2)");
                  int G = input.nextInt();
                  if (G == 1){
                    System.out.println("\n\n\n\nYou waited too long and because of your idea of telling the Aesop about what is happening in your kingdom, Aesop plans an attack and plunders Atlas. This is the story of the fall of Atlas.");
                  } else if (G == 2){
                    System.out.println("\n\n\n\nMinos: Tonight is the right time to attack Atlas. This is our golden opportunity, if we miss it we would never be able to revolt again.\nMountain Men: You are right Minos, lets attack tonight\n\nHow do you want to attack?\nKill the royals(1)\nConvince the guards(2)");
                    int H = input.nextInt();
                    if (H == 1){
                      System.out.println("\n\n\n\nMinos: Lets attack the royals, we might not get another chance like this ever again!\nMinos and the men go into the royal chamber. \n\nWhat would you do?\nKill all the royals(1)\nKill only the men(2)");
                      int I = input.nextInt();
                      if (I == 1){

                      } else if (I == 2){

                      }
                    } else if (H == 2){
                      System.out.println("\n\n\n\n");
                    }
                  }
                }
              } else if (E == 2){

              }
            } else if (D == 2){
              System.out.println("Minos: Lets ambush at the dead of night\nMountain men: That isn’t an honorable way to fight but we do what we must do!\nMinos: Thank you men\nOther Priest: When should we attack?\nMinos: Tonight is the right time to attack!\n(That night inside the castle)\n\nWhat should the men do?\nKill the noble(1)\nConvince some soldiers to join their side(2)");
              int E = input.nextInt();
              if (E == 1){

              } else if (E == 2){

              }
            }
          } else if (C == 2){
            System.out.println("\n\n\n\nMinos: Lets fight alongside the northern Bandits \nOther Priests: That could end badly \nBandits: Just say a word and we are with you!\n\nTactis:\nTake the river road(1) \nAmbush in the dead of night(2)");
            int D = input.nextInt();
            if (D == 1){

            } else if (D == 2){
              System.out.println("\n\n\n\nMinos: Lets ambush at the dead of night\nBandits: It is the right way to attack!\nMinos: Thank you men\nOther Priest: When should we attack?\nMinos: Tonight is the right time to attack!\n(That night inside the castle)\n\nWhat should the Bandits do?\nKill the noble(1)\nConvince some soldiers to join their side(2)");
              int E = input.nextInt();
              if (E == 1){
                System.out.println("\n\n\n\n");
              } else if (E == 2){
                System.out.println("\n\n\n\nMinos: Lets try to convince the guards and make them join us!\nBandits: That could end badly for us! But we will do it!\nMinos: Thank you men\nMinos: You are the soldier I trust inside the castle, are there any one loyal to our command\nSoldier: Some in the castle follow me\n\nWhat will you do?\nFollow the Guard(1)\nDon’t trust the Guard(2)");
                int F = input.nextInt();
                if (F == 1){
                  System.out.println("\n\n\n\nYou trusted the guard but the guard wasn’t loyal to you. So he led you to an ambush in the kings chambers. Try to look for clues in the passage next time and you will get farther in the game.");
                } else if (F == 2){
                  System.out.println("\n\n\n\nMinos: Sorry but the last time I trusted you, you warned the king.\nSoldier: How dare you question my loyalty? \n(You grab the soldier by his collar)\n\nWhat will you do?\nInterrogate the Soldier(1)\nKill the Soldier(2)");
                  int G = input.nextInt();
                  if (G == 1){
                    System.out.println("\n\n\n\nMinos: Men do what you are good at!\n(Soldier is interrogated by the bandits)\nSoldier: Please stop! Everyone is in the banquet hall waiting for you to come. So they could get rid of you!\nMinos: How do they know I am coming to attack?\nSoldier: One of the people in your pack is a rat feeding information to the king and his soldiers!\n\nShould you listen to his words? \nYes (1)\nNo (2)");
                    int H = input.nextInt();
                    if (H == 1){
                      System.out.println("\n\n\n\nMinos: Who among you is a rat?\nOther priests: We are not a rat!\n\nDo you want to interrogate your fellow priest to find out the information?\nYes\nNo");
                      int I = input.nextInt();
                      if (I == 1){
                        System.out.println("\n\n\n\nMinos: Fellow Bandits, I don’t trust my priest brothers! Interrogate them to get the answer out of them!\n(Bandits interrogate the priests)\nThe priest respect and trust for you have went down because of your actions\nArnold: I was the rat, please forgive me\n\nDo you want to forgive him?\nForgive him(1)\nKill him(2)");
                        int J = input.nextInt();
                        if (J == 1){
                          System.out.println("\n\n\n\nMinos: You are forgiven but don’t defy me again!\nArnold: I am sorry\nThe members ask you what they should do, you tell them to check inside the banquet hall through the back entrance quietly. They search and come back…\nBandits: There is no one there!\nMinos: How dare you lie to me you traitor!\nSoldier: They were right there just a second ago!\n");
                        } else if (J == 2){
                          System.out.println("\n\n\n\nMinos: Kill the traitor!\n(Bandits kill Arnold)\nAll the priest have decided that you are power hungry and leave you on your own.\nMinos: Lets kill the royals\nYou go to the royals room and learning that they are in the banquet hall, you decide to detonate the banquet hall");
                        }
                      } else if (I == 2){

                      }
                    } else if (H == 2){
                      System.out.println("\n\n\n\nMinos: I know who my men are and I wouldn’t listen to your sly words!\nThe priest and bandits acknowledge your trust and compassion\nOther Priests: After this we are willing to let down our lives for you!\nMinos: With that said, tie up the soldier so no one can hear him\nYou and your men march down the side of the banquet. There is an army of at least one thousand. Then you hear a cry to arms behind you. You are filled with confusion and don’t understand what has happened.One of the men approach you and says\nStranger: Minos we knew you would return and our hopes haven’t died.\nMinos: I am thankful for your passion but how will we defend a army with my men and a handful of your men?\nStranger: We can either try stealth attack or we can go to straight combat which would you prefer?\n\nWhat would you do?\nStealth (1)\nCombat (2)");
                      int I = input.nextInt();
                    }
                  } else if (G == 2){
                    System.out.println("\n\n\n\n");
                  }
                }
              }
            }
          }
        }
      } else if (Choice == 2) {
        System.out.println("\n\n\n\nYou should have been aware of the consequences of your action. By going into battle unprepared you have died in the battle! Try to look for clues in the passage next time and you will get farther in the story. \n Press '0' to restart");
      }
      break;

      // case 2:
      //
      //   break;
      //
      // case 3:
      //
      //   break;
    }
    // if (position == 1){
    //     int Choice = input.nextInt();
    //
    //     } else if (position == 2){
    //   System.out.println("The Sorcerers is the faction that believes in the dark arts. The leader of the Sorcerers is Okeanos, the leader of the outcasts of the kingdom. They have high morals and have magical powers. They would be harsh to his citizens. They stand against everything that the king believed in.");
    // }
    // else if (position == 3){
    //   System.out.println("The Nobles is the faction that believes that the monarchs should always the power. The leader of the Nobles is Zephyr, the descendent of the last king but he is an illegitimate child. They have low morals and aims for personal wealth before all. But after becoming rich, he would be fair and harsh to his citizens.");
    // }
  }
}
