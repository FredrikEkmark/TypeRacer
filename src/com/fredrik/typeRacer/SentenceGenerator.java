package com.fredrik.typeRacer;

import java.util.Random;

public class SentenceGenerator {
    private String[] speedGameSentences = {
            "Race against the clock as if it owes you money – because apparently, time has been borrowing from you without asking!",
            "This game is so fast, even coffee needs a caffeine boost to keep up! Don't worry, no java beans were harmed in the making of this code.",
            "If speed were a sport, you'd be the Usain Bolt of typing. Bolt, please don't challenge us; we're just trying to type, not sprint!",
            "Our game is so swift, it once outran its own shadow. We called it 'Project Speed-of-Light,' but the shadow had copyright issues.",
            "In this typing extravaganza, your fingers will move so fast that even the Flash would be jealous. Warning: Side effects may include a sudden urge to challenge superheroes to a type-off.",
            "Type faster than a cat trying to escape a bath – good luck, and may your keyboard remain dry!",
            "If typing were an Olympic sport, you'd be on the podium, wearing a gold medal made of code and silver keys.",
            "Our game is so rapid that even the 'Loading' screen loads faster than you can say 'loading.'",
            "Do you hear that? It's the sound of your fingers racing across the keyboard like a herd of caffeinated squirrels!",
            "Type like the wind, but without the messy hair and questionable fashion choices. Your keyboard is your runway!",
            "If words could run, yours would be in a marathon, and you'd be the proud owner of a linguistic trophy.",
            "This game is so quick that even autocorrect struggles to keep up. Prepare for typos, the unsung heroes of speed typing!",
            "In the world of speed typing, you're not just a typist – you're a keyboard maestro orchestrating a symphony of letters!",
            "Channel your inner keyboard ninja and type with the speed and precision of a samurai slicing through words like a swift blade!",
            "You're not just typing; you're engaging in a fierce battle with the alphabet, and victory tastes like well-spelled success!",
            "Our game is so fast that it makes the Flash question his life choices. He might consider a career change to typing superhero!",
            "Type so fast that even your computer is impressed and sends you a pop-up saying, 'Wow, that was quick!'",
            "In the world of speed typing, you're not breaking records; you're shattering them into a million tiny keystrokes.",
            "If typing were a dance, you'd be the Fred Astaire of fingers, gliding effortlessly across the keyboard.",
            "Move over, race cars! There's a new speed champion in town, and it's the person typing faster than a Formula 1 car on a caffeine high!",
            "Type so swiftly that your keyboard wonders if it's on a roller coaster – ups, downs, and a few loops for good measure!",
            "In this game, you're not just typing; you're composing a symphony of words, and your keyboard is the conductor's baton.",
            "Type with the precision of a surgeon, the speed of a cheetah, and the confidence of someone who's never hit the backspace key!",
            "If typing were an art form, you'd be the Picasso of keyboards, creating masterpieces with every keystroke.",
            "Our game is so rapid that it makes the space-time continuum jealous. Einstein would be impressed – and slightly confused!",
            "Type so fast that even the Matrix would struggle to keep up. Welcome to the digital dojo of typing mastery!",
            "You're not just typing; you're on a linguistic roller coaster, and your words are the thrilling twists and turns!",
            "In the world of speed typing, you're not racing against others; you're racing against yesterday's version of yourself. Can you beat it?",
            "Type faster than a caffeinated hummingbird trying to break the sound barrier – and leave a trail of perfectly spelled nectar behind!",
            "Your fingers are on fire – not literally, of course, but metaphorically burning through words like a literary pyromaniac!",
            "If typing were a sport, you'd be the MVP, the Most Valuable Typist, celebrated for your unparalleled speed and accuracy.",
            "Move over, sprinters! There's a new race in town, and it involves fingers flying across the keyboard at record-breaking speeds!",
            "Our game is so fast that even the Flash would consider it a workout. Who needs running when you can type at lightning speed?",
            "Type with the intensity of a thousand suns, or at least with the fervor of someone trying to finish a novel before bedtime.",
            "In the world of speed typing, you're not just a participant; you're the undisputed champion of the keyboard arena.",
            "Type so swiftly that your keyboard feels like it's on a high-speed train, and you're the conductor navigating through a text-filled landscape.",
            "Your fingers are the Usain Bolt of the typing world, leaving competitors in the dust and setting new records with every sentence.",
            "In the kingdom of keyboards, you're the reigning monarch, and your subjects are the letters bowing to your typing prowess.",
            "Type faster than a computer trying to install updates – and without the frustration of waiting for progress bars to fill!",
            "Your fingers are like lightning, illuminating the dark screen with the brilliance of perfectly typed words. Thunderous applause!",
            "In this game, you're not just typing; you're composing a symphony of words, and your keyboard is the virtuoso playing the masterpiece.",
            "Type with the grace of a ballerina and the speed of a fighter jet – a lethal combination for conquering the world of words.",
            "Move over, typewriters! There's a new sheriff in town, and it's the person typing at speeds that make old-school machines jealous.",
            "Our game is so fast that even time-traveling typists from the future would struggle to keep up with your lightning-fast keystrokes.",
            "Type faster than a sloth on a sugar rush – because in this game, slow and steady does not win the typing race!",
            "You're not just typing; you're on a linguistic roller coaster, and your words are the thrilling twists and turns!",
            "In the world of speed typing, you're not racing against others; you're racing against yesterday's version of yourself. Can you beat it?",
            "Type faster than a caffeinated hummingbird trying to break the sound barrier – and leave a trail of perfectly spelled nectar behind!",
            "Your fingers are on fire – not literally, of course, but metaphorically burning through words like a literary pyromaniac!",
            "If typing were a sport, you'd be the MVP, the Most Valuable Typist, celebrated for your unparalleled speed and accuracy.",
            "Move over, sprinters! There's a new race in town, and it involves fingers flying across the keyboard at record-breaking speeds!",
            "Our game is so fast that even the Flash would consider it a workout. Who needs running when you can type at lightning speed?",
            "Type with the intensity of a thousand suns, or at least with the fervor of someone trying to finish a novel before bedtime.",
            "In the world of speed typing, you're not just a participant; you're the undisputed champion of the keyboard arena.",
            "Type so swiftly that your keyboard feels like it's on a high-speed train, and you're the conductor navigating through a text-filled landscape.",
            "Your fingers are the Usain Bolt of the typing world, leaving competitors in the dust and setting new records with every sentence.",
            "In the kingdom of keyboards, you're the reigning monarch, and your subjects are the letters bowing to your typing prowess.",
            "Type faster than a computer trying to install updates – and without the frustration of waiting for progress bars to fill!",
            "Your fingers are like lightning, illuminating the dark screen with the brilliance of perfectly typed words. Thunderous applause!",
            "In this game, you're not just typing; you're composing a symphony of words, and your keyboard is the virtuoso playing the masterpiece.",
            "Type with the grace of a ballerina and the speed of a fighter jet – a lethal combination for conquering the world of words.",
            "Move over, typewriters! There's a new sheriff in town, and it's the person typing at speeds that make old-school machines jealous.",
            "Our game is so fast that even time-traveling typists from the future would struggle to keep up with your lightning-fast keystrokes.",
            "Type faster than a sloth on a sugar rush – because in this game, slow and steady does not win the typing race!",
            "You're not just typing; you're on a linguistic roller coaster, and your words are the thrilling twists and turns!",
            "In the world of speed typing, you're not racing against others; you're racing against yesterday's version of yourself. Can you beat it?",
            "Type faster than a caffeinated hummingbird trying to break the sound barrier – and leave a trail of perfectly spelled nectar behind!",
            "Your fingers are on fire – not literally, of course, but metaphorically burning through words like a literary pyromaniac!",
            "If typing were a sport, you'd be the MVP, the Most Valuable Typist, celebrated for your unparalleled speed and accuracy.",
            "Move over, sprinters! There's a new race in town, and it involves fingers flying across the keyboard at record-breaking speeds!",
            "Our game is so fast that even the Flash would consider it a workout. Who needs running when you can type at lightning speed?",
            "Type with the intensity of a thousand suns, or at least with the fervor of someone trying to finish a novel before bedtime.",
            "In the world of speed typing, you're not just a participant; you're the undisputed champion of the keyboard arena.",
            "Type so swiftly that your keyboard feels like it's on a high-speed train, and you're the conductor navigating through a text-filled landscape.",
            "Your fingers are the Usain Bolt of the typing world, leaving competitors in the dust and setting new records with every sentence.",
            "In the kingdom of keyboards, you're the reigning monarch, and your subjects are the letters bowing to your typing prowess.",
            "Type faster than a computer trying to install updates – and without the frustration of waiting for progress bars to fill!",
            "Your fingers are like lightning, illuminating the dark screen with the brilliance of perfectly typed words. Thunderous applause!",
            "In this game, you're not just typing; you're composing a symphony of words, and your keyboard is the virtuoso playing the masterpiece.",
            "Type with the grace of a ballerina and the speed of a fighter jet – a lethal combination for conquering the world of words.",
            "Move over, typewriters! There's a new sheriff in town, and it's the person typing at speeds that make old-school machines jealous.",
            "Our game is so fast that even time-traveling typists from the future would struggle to keep up with your lightning-fast keystrokes.",
            "Type faster than a sloth on a sugar rush – because in this game, slow and steady does not win the typing race!",
            "Type so fast that even autocorrect gets confused and starts questioning its life choices.",
            "In this game, your fingers are the superheroes, and the keyboard is the city that needs saving – type to the rescue!",
            "Move over, snails! Your typing speed is so impressive that even the slowest creatures envy your swift keystrokes.",
            "If typing were a dance floor, you'd be the undisputed champion of the quickstep, waltzing through words with finesse.",
            "Our game is so rapid that it once solved a Rubik's Cube while waiting for your fingers to catch up!",
            "Type faster than a rumor spreading on social media – but with more accuracy and fewer fake news typos.",
            "Your typing speed is like a magic spell – words appear on the screen as if summoned by the fastest wizard in the realm.",
            "In this game, you're not just typing; you're composing a symphony of words, and your keyboard is the musical conductor.",
            "Type with the ferocity of a dragon breathing fire, turning blank screens into landscapes of perfectly written tales.",
            "Move over, rocket ships! Your fingers are on a journey through the cosmos of words, exploring new frontiers at warp speed.",
            "Our game is so fast that it once outpaced a running joke – and it was a really quick joke!",
            "Type faster than a squirrel hoarding acorns for winter – because words are your nuts, and you're storing them for literary survival.",
            "If typing were a superpower, you'd be the hero the world didn't know it needed – the Typing Avenger!",
            "Our game is so swift that it once lapped a tortoise – twice. Sorry, Aesop!",
            "Type with the precision of a surgeon, the speed of a race car, and the calmness of a cucumber. You're a typing maestro!",
            "In the world of speed typing, you're not just a participant; you're the Flash in a world of slow-motion typists.",
            "Type faster than a magician pulling rabbits out of a hat – but with fewer rabbits and more accurately spelled words.",
            "Your typing speed is like a roller coaster – thrilling, fast-paced, and occasionally inducing a delightful sense of word nausea.",
            "In this game, you're not just typing; you're on a literary sprint, leaving a trail of well-crafted sentences in your wake.",
            "Type with the grace of a ballet dancer and the speed of a cheetah – a ballet of words at the speed of wildlife.",
            "Move over, hummingbirds! Your fingers are the true speed demons, sipping the nectar of knowledge and leaving no typos behind.",
            "Our game is so fast that it once played catch with a speeding bullet – and won!",
            "Type faster than a rumor spreading through a high school – but with fewer teenage dramas and more accurate spelling.",
            "If typing were an art gallery, your keyboard would be the canvas, and each keystroke a stroke of genius.",
            "Our game is so quick that it once broke the sound barrier – or was it the space bar? Things got a bit hazy at that speed.",
            "Type with the urgency of someone trying to send a text before their phone dies – but with the eloquence of a wordsmith.",
            "In the world of speed typing, you're not just typing; you're crafting an epic saga, one lightning-fast word at a time.",
            "Type faster than a toddler running towards an ice cream truck – because words are your sweet treat!",
            "Your typing speed is like a caffeinated squirrel on rollerblades – fast, agile, and occasionally doing unexpected tricks.",
            "In this game, you're not just typing; you're the commander of a fleet of words, navigating the sea of sentences with precision.",
            "Type with the speed of a bullet train, making stops only at the stations of perfectly typed paragraphs.",
            "Our game is so fast that it once outran a rumor – and left it breathless trying to catch up!",
            "Type faster than a speeding penguin sliding down an icy slope – because words are your slippery playground.",
            "Move over, typewriters! Your keyboard is the modern-day marvel, and your fingers are the superheroes typing their epic tale.",
            "If typing were a cooking show, you'd be the master chef, chopping through words with the speed and precision of a culinary genius.",
            "Our game is so swift that it once played hide and seek with a ninja – and the ninja lost!",
            "Type faster than a computer trying to keep up with the latest software updates – and with fewer error messages.",
            "In the world of speed typing, you're not just typing; you're on a linguistic roller coaster, and your words are the thrilling twists and turns!",
            "Type faster than a caffeinated hummingbird trying to break the sound barrier – and leave a trail of perfectly spelled nectar behind!",
            "Your fingers are on fire – not literally, of course, but metaphorically burning through words like a literary pyromaniac!",
            "If typing were a sport, you'd be the MVP, the Most Valuable Typist, celebrated for your unparalleled speed and accuracy.",
            "Move over, sprinters! There's a new race in town, and it involves fingers flying across the keyboard at record-breaking speeds!",
            "Our game is so fast that even the Flash would consider it a workout. Who needs running when you can type at lightning speed?",
            "Type with the intensity of a thousand suns, or at least with the fervor of someone trying to finish a novel before bedtime.",
            "In the world of speed typing, you're not just a participant; you're the undisputed champion of the keyboard arena.",
            "Type so swiftly that your keyboard feels like it's on a high-speed train, and you're the conductor navigating through a text-filled landscape.",
            "Your fingers are the Usain Bolt of the typing world, leaving competitors in the dust and setting new records with every sentence.",
            "In the kingdom of keyboards, you're the reigning monarch, and your subjects are the letters bowing to your typing prowess.",
            "Type faster than a computer trying to install updates – and without the frustration of waiting for progress bars to fill!",
            "Your fingers are like lightning, illuminating the dark screen with the brilliance of perfectly typed words. Thunderous applause!",
            "In this game, you're not just typing; you're composing a symphony of words, and your keyboard is the virtuoso playing the masterpiece.",
            "Type with the grace of a ballerina and the speed of a fighter jet – a lethal combination for conquering the world of words.",
            "Move over, typewriters! There's a new sheriff in town, and it's the person typing at speeds that make old-school machines jealous.",
            "Our game is so fast that even time-traveling typists from the future would struggle to keep up with your lightning-fast keystrokes.",
            "Type faster than a sloth on a sugar rush – because in this game, slow and steady does not win the typing race!",
            "Chuck Norris doesn't believe in the tooth fairy. Instead, he leaves a roundhouse kick under kids' pillows, ensuring they wake up with a sense of martial arts justice.",
            "Chuck Norris's smartphone isn't touch-sensitive. It operates on a system of sheer intimidation – apps open themselves out of fear.",
            "Chuck Norris's pet fish doesn't swim; it levitates in its bowl. It's not about water; it's about the fish respecting the laws of Chuck's aquatic dominance.",
            "When Chuck Norris plays hide and seek, the hiding spots voluntarily reveal themselves out of fear.",
            "Chuck Norris's printer doesn't need ink. It prints using the blood of its vanquished paper adversaries.",
            "Chuck Norris can unscramble a Rubik's Cube with his mind and then roundhouse kick it into perfect alignment.",
            "Chuck Norris's watch doesn't tell time; it commands the universe to synchronize with his schedule.",
            "When Chuck Norris does a push-up, he's not lifting himself up; he's pushing the Earth down – just to stay in shape.",
            "Chuck Norris's beard isn't facial hair; it's a separate entity with its own black belt in martial arts.",
            "Chuck Norris doesn't read bedtime stories to his kids. He tells them tales of his adventures, ensuring they have legendary dreams.",
            "When Chuck Norris sends a text, the emojis become real and express gratitude for being chosen to convey his messages.",
            "Chuck Norris can slam a revolving door and make it question its purpose in life.",
            "Chuck Norris's shadow has its own shadow – because nothing can escape the influence of Chuck.",
            "Chuck Norris doesn't need a remote control. He simply stares at the TV, and the channels change out of sheer obedience.",
            "Chuck Norris's GPS doesn't give directions; it issues respectful suggestions to the roads on how to best serve him.",
            "When Chuck Norris takes a selfie, the camera acknowledges its privilege to capture his legendary image.",
            "Chuck Norris's diet doesn't cheat days; it has days where food feels honored to be consumed by him.",
            "Chuck Norris doesn't do math. He calculates the universe's respect for his mathematical prowess.",
            "When Chuck Norris was born, he delivered himself – the doctor was just there to assist in case Chuck needed help.",
            "Chuck Norris's refrigerator doesn't have a light. When he opens it, the darkness knows better than to stick around."
    };

    public String getRandomSentence() {
        Random random = new Random();
        int randomIndex = random.nextInt(0, speedGameSentences.length);
        return speedGameSentences[randomIndex];
    }

}
