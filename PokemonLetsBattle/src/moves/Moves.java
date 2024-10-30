package moves;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;

import moves.Move.MoveType;
import properties.*;

/*** MOVES ENUM ***/
public enum Moves {
	// ATTACK DESCRIPTION REFERENCE (GEN IV): https://www.serebii.net/attackdex-dp/
	
	CONFUSE("Confuse", MoveType.PHYSICAL, Type.NORMAL, 1, 40, -1, "Confused"),
	ABSORB ("Absorb", MoveType.SPECIAL, Type.GRASS, 20, 20, 100, 
			"A nutrient-draining attack.\nThe user's HP is restored\nby half the damage taken\nby the target."),
	AGILITY ("Agility", MoveType.ATTRIBUTE, Type.PSYCHIC, true, 30, -1, 1, Arrays.asList("speed"), 
			"The user relaxes and\nlightens its body to move\nfaster. It sharply boosts\nthe Speed stat."),
	AIRSLASH ("Air Slash", MoveType.SPECIAL, Type.FLYING, 0.30, 20, 75, 95,
			"The user attacks with a\nblade of air that slices\neven the sky. It may also\nmake the target flinch."),
	AMNESIA ("Amnesia", MoveType.ATTRIBUTE, Type.PSYCHIC, true, 20, -1, 2, Arrays.asList("sp. defense"),
			"The user temporarily empties\nits mind to forget its con-\ncerns. It sharply raises the\nuser's Sp. Def stat."),
	AQUATAIL ("Aqua Tail", MoveType.PHYSICAL, Type.WATER, 10, 135, 90, 
			"The user attacks by swing-\ning its tail as if it were a\nvicious wave in a raging\nstorm."),
	ASTONISH ("Astonish", MoveType.PHYSICAL, Type.GHOST, 0.30, 15, 30, 100, 
			"The user attacks the foe\nwhile shouting in a startling\nfashion. It may also make\nthe target flinch."),
	AURORABEAM ("Aurora Beam", MoveType.SPECIAL, Type.ICE, 20, 65, 100, 
			"The foe is hit with a\nrainbow-colored beam."),
	BITE ("Bite", MoveType.PHYSICAL, Type.DARK, 0.30, 25, 60, 100,  
			"The foe is bitten with\nviciously sharp fangs.\nIt may make the target\nflinch."),
	BLASTBURN ("Blast Burn", MoveType.SPECIAL, Type.FIRE, 5, 150, 90, 1, false, true, 
			"is\nresting...",
			"The target is razed by a\nfiery explosion. The user\ncan't move on the next\nturn."),
	BLAZEKICK ("Blaze Kick", MoveType.PHYSICAL, Type.FIRE, Status.BURN, 0.10, 10, 85, 90, 1, 
			"The user launches a kick\nwith a high critical-hit\nratio. It may also leave\nthe target with a burn."),
	BLIZZARD ("Blizzard", MoveType.SPECIAL, Type.ICE, Status.FREEZE, 0.10, 5, 120, 70, 
			"A howling blizzard is\nsummoned to strike the foe.\nIt may also freeze the\ntarget solid."),
	BODYSLAM ("Body Slam", MoveType.PHYSICAL, Type.NORMAL, Status.PARALYZE, 0.10, 15, 85, 100, 
			"The user drops onto the foe\nwith its full body weight.\nIt may leave the foe\nparalyzed."),
	BRINE ("Brine", MoveType.SPECIAL, Type.WATER, 10, 65, 100,
			"If the foe's HP is down to\nhalf, this attack will hit\nwith double the power."),
	BUBBLE ("Bubble", MoveType.SPECIAL, Type.WATER, 30, 20, 100, 
			"A spray of countless\nbubbles is jetted at the\nfoe."),
	BUBBLEBEAM ("Bubblebeam", MoveType.SPECIAL, Type.WATER, false, 0.10, 20, 65, 100, -1, Arrays.asList("speed"),
			"A spray of bubbles is force-\nfully ejected at the foe.\nIt may also lower the target's\nSpeed stat."),
	CALMMIND ("Calm Mind", MoveType.ATTRIBUTE, Type.PSYCHIC, true, 20, -1, 1, Arrays.asList("sp. attack", "sp. defense"), 
			"The user quietly focuses\nits mind and calms its spirit\nto raise its Sp. Atk and\nSp. Def stats."),
	CONFUSERAY ("Confuse Ray", MoveType.STATUS, Type.GHOST, Status.CONFUSE, 10, 100, 
			"The foe is exposed to a\nsinister ray that triggers\nconfusion."),
	CONFUSION ("Confusion", MoveType.SPECIAL, Type.PSYCHIC, 25, 75, 100, 
			"The foe is hit by a weak\ntelekinetic force.\nIt may also leave the foe\nconfused."),
	CROSSCHOP ("Cross Chop", MoveType.PHYSICAL, Type.FIGHTING, 5, 150, 80, 1, 
			"The user delivers a double\nchop with its forearms\ncrossed. It has a high\ncritical-hit ratio."),
	CRUNCH ("Crunch", MoveType.PHYSICAL, Type.DARK, 15, 80, 100, 
			"The user crunches up the\nfoe with sharp fangs."),
	CUT ("Cut", MoveType.PHYSICAL, Type.NORMAL, 30, 50, 95, 
			"The foe is cut with a scythe\nor a claw.\nIt can also be used\nto cut down thin trees."),
	DARKPULSE ("Dark Pulse", MoveType.SPECIAL, Type.DARK, 0.20, 15, 80, 100, 
			"The user releases a horr-\nible aura imbued with dark\nthoughts. It may also make\nthe target flinch."),
	DEFENSECURL ("Defense Curl", MoveType.ATTRIBUTE, Type.NORMAL, true, 40, -1, 1, Arrays.asList("defense"), 
			"The user curls up to\nconceal weak spots and\nraise its Defense stat."),
	DIG ("Dig", MoveType.PHYSICAL, Type.GROUND, 10, 80, 100, 1, true, false,
			"dug\ninto the ground!", 
			"The user burrows, then\nattacks on the second turn.\nIt can also be used to exit\ndungeons."),
	DOUBLEEDGE ("Double Edge", MoveType.PHYSICAL, Type.STEEL, 10, 80, 100, 0.25, 
			"A reckless, life-risking\ntackle.\nIt also damages the user\nby a fairly large amount."),
	DOUBLEKICK ("Double Kick", MoveType.PHYSICAL, Type.FIGHTING, 35, 60, 100, 
			"The foe is quickly kicked\ntwice in succession using\nboth feet."),
	DRAGONBREATH ("Dragon Breath", MoveType.SPECIAL, Type.DRAGON, Status.PARALYZE, 0.10, 20, 60, 100, 
			"The user exhales a mighty\ngust that inflicts damage.\nIt may also paralyze the\ntarget."),
	DRAGONCLAW ("Dragon Claw", MoveType.PHYSICAL, Type.DRAGON, 15, 80, 100, 
			"The user slashes the foe\nwith huge, sharp claws."),
	DRAGONDANCE ("Dragon Dance", MoveType.ATTRIBUTE, Type.DRAGON, true, 20, -1, 1, Arrays.asList("attack", "speed"),
			"The user vigorously performs\na mystic, powerful dance that\nraises its Attack and Speed\nstats."),
	DRAGONPULSE ("Dragon Pulse", MoveType.SPECIAL, Type.DRAGON, 10, 90, 100, 
			"The foe is attacked with a\nshock wave generated by\nthe user's gaping mouth."),
	DYNAMICPUNCH ("Dynamic Punch", MoveType.PHYSICAL, Type.FIGHTING, Status.CONFUSE, 1.0, 5, 150, 50, 
			"The foe is punched with the\nuser's full, concentrated\npower. It confuses the foe\nif it hits."),
	EARTHQUAKE ("Earthquake", MoveType.PHYSICAL, Type.GROUND, 10, 150, 100, 
			"The user sets off an\nearthquake that hits all\nthe Pokémon in the battle."),
	EMBER ("Ember", MoveType.SPECIAL, Type.FIRE, Status.BURN, 0.10, 25, 60, 100, 
			"The foe is attacked with\nsmall flames.\nThe target may also be left\nwith a burn."),
	ENERGYBALL ("Energy Ball", MoveType.SPECIAL, Type.GRASS, false, 0.10, 10, 90, 100, -1, Arrays.asList("sp. defense"), 
			"The user draws power from\nnature and fires it at the\ntarget. It may also lower\nthe target's Sp. Def."),
	EXTRASENSORY ("Extrasensory", MoveType.SPECIAL, Type.PSYCHIC, 30, 80, 100, 
			"The user attacks with an\nodd, unseeable power."),
	EXTREMESPEED ("Extreme Speed", MoveType.PHYSICAL, Type.NORMAL, 5, 80, 100, 
			"The user charges the foe\nat blinding speed.\nThis attack always goes\nbefore any other move."),
	FIREBLAST ("Fire Blast", MoveType.SPECIAL, Type.FIRE, Status.BURN, 0.10, 5, 120, 85, 
			"The foe is attacked with an\nintense blast of fire. It\nmay also leave the target\nwith a burn."),
	FIREFANG ("Fire Fang", MoveType.PHYSICAL, Type.FIRE, Status.BURN, 0.10, 0.10, 15, 95, 95, 
			"The user bites with flame\n-cloaked fangs.\nIt may also make the foe\nflinch or sustain a burn."),
	FIREPUNCH ("Fire Punch", MoveType.PHYSICAL, Type.FIRE, Status.BURN, 0.10, 15, 75, 100, 
			"The foe is punched with a\nfiery fist.\nIt may leave the target\nwith a burn."),
	FIRESPIN ("Fire Spin", MoveType.SPECIAL, Type.FIRE, 15, 15, 70, 
			"The foe becomes trapped\nwithin a fierce vortex of\nfire that rages for two to\nfive turns."),
	FLAMETHROWER ("Flamethrower", MoveType.SPECIAL, Type.FIRE, Status.BURN, 0.10, 15, 135, 100, 
			"The foe is scorched with an\nintense blast of fire.\nThe target may also be\nleft with a burn."),
	FLAREBLITZ ("Flare Blitz", MoveType.PHYSICAL, Type.FIRE, Status.BURN, 0.10, 15, 120, 100, 
			"The foe is scorched with an\nintense blast of fire.\nThe target may also be\nleft with a burn."),
	FLASHCANNON ("Flash Cannon", MoveType.SPECIAL, Type.STEEL, 10, 80, 100, 
			"The user gathers all its\nlight energy and releases it at\nonce."),
	FLY ("Fly", MoveType.PHYSICAL, Type.FLYING, 15, 90, 95, 1, true, false,
			"took\nflight!", 
			"The user soars, then\nstrikes on the second turn.\nIt can also be used for\nflying to any familiar town."),
	FOCUSBLAST ("Focus Blast", MoveType.SPECIAL, Type.FIGHTING, false, 0.10, 5, 120, 70, -1, Arrays.asList("sp. defense"), 
			"The user heightens its\nmental focus and unleashes\nits power. It may also\nlower the target's Sp. Def."),
	FRENZYPLANT ("Frenzy Plant", MoveType.SPECIAL, Type.GRASS, 5, 150, 90, 1, false, true,
			"is\nresting...",
			"The foe is slammed with an\nenormous tree. The user\ncan't move on the next\nturn."),
	GIGADRAIN ("Giga Drain", MoveType.SPECIAL, Type.GRASS, 10, 60, 100, 
			"A nutrient-draining attack.\nThe user's HP is restored\nby half the damage taken by\nthe target."),
	GIGAIMPACT ("Giga Impact", MoveType.PHYSICAL, Type.NORMAL, 5, 150, 90, 1, false, true,
			"is\nresting...",
			"The user charges at the foe\nusing every bit of its power.\nThe user must rest on the\nnext turn."),
	GROWL ("Growl", MoveType.ATTRIBUTE, Type.NORMAL, false, 40, 100, -1, Arrays.asList("attack"), 
			"The user growls, making the\nfoe less wary.\nThe target's Attack stat\nis lowered."),
	GROWTH ("Growth", MoveType.ATTRIBUTE, Type.NORMAL, true, 20, -1, 1, Arrays.asList("attack", "sp. attack"),
			"The user's body grows all at\nonce, raising the Attack and\nSp. Atk stats."),
	GUST ("Gust", MoveType.SPECIAL, Type.FLYING, 35, 40, 100,
			"A gust of wind is whipped up\nby wings and launched at the\nfoe to inflict damage."),
	HAIL ("Hail", MoveType.WEATHER, Type.ICE, 10, 5, "HAIL",
			"The user summons a hail-\nstorm lasting five turns.\nIt damages all Pokémon\nexcept the Ice type."),
	HEATWAVE ("Heat Wave", MoveType.SPECIAL, Type.FIRE, Status.BURN, 0.10, 10, 100, 90, 
			"The user exhales a heated\nbreath on the foe to attack.\nIt may also leave the target\nwith a burn."),
	HEAVYSLAM ("Heavy Slam", MoveType.PHYSICAL, Type.NORMAL, 20, 80, 75,
			"The user slams into the\ntarget with its heavy body."),
	HEX ("Hex", MoveType.SPECIAL, Type.GHOST, 10, 95, 100, 
			"This relentless attack does\nmassive damage to a target\naffected by status\nconditions."),
	HOWL ("Howl", MoveType.ATTRIBUTE, Type.NORMAL, true, 40, -1, 1, Arrays.asList("attack"),
			"The user howls loudly to\nraise its spirit, boosting\nits Attack stat."),
	HYDROCANNON ("Hydro Cannon", MoveType.SPECIAL, Type.WATER, 5, 150, 90, 1, false, true,
			"is\nresting...",
			"The foe is hit with a watery\nblast. The user must rest\non the next turn, however."),
	HYDROPUMP ("Hydro Pump", MoveType.SPECIAL, Type.WATER, 5, 165, 80, 
			"The foe is blasted by a huge\nvolume of water launched\nunder great pressure."),
	HYPERBEAM ("Hyper Beam", MoveType.SPECIAL, Type.NORMAL, 5, 150, 90, 1, false, true,
			"is\nrecharging...",
			"The foe is attacked with a\npowerful beam. The user\nmust rest on the next turn\nto regain its energy."),
	HYPERVOICE ("Hyper Voice", MoveType.SPECIAL, Type.NORMAL, 10, 90, 100, 
			"The user lets loose a\nhorribly echoing shout with\nthe power to inflict damage."),
	HYPNOSIS ("Hypnosis", MoveType.STATUS, Type.PSYCHIC, Status.SLEEP, 20, 60, 
			"The user employs hypnotic\nsuggestion to make the\ntarget fall into a deep\nsleep."),
	ICEBEAM ("Ice Beam", MoveType.SPECIAL, Type.ICE, Status.FREEZE, 0.10, 10, 95, 100, 
			"The foe is struck with an\nicy-cold beam of energy.\nIt may also freeze the\ntarget solid."),
	ICEFANG ("Ice Fang", MoveType.PHYSICAL, Type.ICE, Status.FREEZE, 0.10, 15, 65, 95, 
			"The user bites with cold-\ninfused fangs.\nIt may also make the foe\nfreeze."),
	ICESHARD ("Ice Shard", MoveType.PHYSICAL, Type.ICE, 30, 40, 100, true, 
			"The user flash freezes chunks\nof ice and hurls them at the\ntarget. This move always\ngoes first."),
	IRONTAIL ("Iron Tail", MoveType.PHYSICAL, Type.STEEL, false, 0.30, 15, 100, 75, -1, Arrays.asList("defense"),
			"The foe is slammed with a\nsteel-hard tail. It may also\nlower the target's Defense\nstat."),
	KARATECHOP ("Karate Chop", MoveType.PHYSICAL, Type.NORMAL, 25, 50, 100, 1,
			"The foe is attacked with a\nsharp chop. It has a high\ncritical-hit ratio."),
	KINESIS ("Kinesis", MoveType.ATTRIBUTE, Type.PSYCHIC, false, 15, 80, -1, Arrays.asList("accuracy"), 
			"The user distracts the foe\nby bending a spoon.\nIt may lower the target's\naccuracy."),
	KNOCKOFF ("Knock Off", MoveType.PHYSICAL, Type.DARK, 20, 65, 100, 
			"The user slaps down the\ntarget's held item,\npreventing that item from\nbeing used in the battle."),
	LEAFBLADE ("Leaf Blade", MoveType.PHYSICAL, Type.GRASS, 15, 90, 100, 1, 
			"The user handles a sharp\nleaf like a sword and\nattacks by cutting its\ntarget."),
	LEAFSTORM ("Leaf Storm", MoveType.SPECIAL, Type.GRASS, 5, 140, 90, 
			"A storm of sharp leaves is\nwhipped up."),
	LEER ("Leer", MoveType.ATTRIBUTE, Type.NORMAL, false, 30, 100, -1, Arrays.asList("defense"), 
			"The foe is given an intimi-\ndating leer with sharp eyes.\nThe target's Defense stat\nis reduced."),
	LICK ("Lick", MoveType.PHYSICAL, Type.GHOST, Status.PARALYZE, 0.10, 30, 45, 100, 
			"The foe is licked with a long\ntongue, causing damage.\nIt may also paralyze the\ntarget."),
	LOWKICK ("Low Kick", MoveType.PHYSICAL, Type.FIGHTING, 20, 40, 100, 
			"A powerful low kick that\nmakes the foe fall over.\nIt inflicts greater damage\non heavier foes."),
	LOWSWEEP ("Low Sweep", MoveType.PHYSICAL, Type.FIGHTING, 20, 95, 100, 
			"The user makes a swift\nattack on the target's\nlegs"),
	MEGADRAIN ("Mega Drain", MoveType.SPECIAL, Type.GRASS, 15, 40, 100, 
			"A nutrient-draining attack.\nThe user's HP is restored by\nhalf the damage taken by the\ntarget."),
	MUDBOMB ("Mud Bomb", MoveType.SPECIAL, Type.GROUND, false, 0.30, 10, 65, 85, -1, Arrays.asList("accuracy"), 
			"The user launches a hard-\npacked mud ball to attack.\nIt may also lower the\ntarget's Accuracy."),
	MUDSHOT ("Mud Shot", MoveType.SPECIAL, Type.GROUND, false, 1.0, 15, 55, 95, -1, Arrays.asList("speed"), 
			"The user attacks by hurling\na blob of mud at the foe.\nIt also reduces the\ntarget's Speed."),
	MUDSLAP ("Mud Slap", MoveType.SPECIAL, Type.GROUND, false, 1.0, 10, 20, 100, -1, Arrays.asList("accuracy"),
			"The user hurls mud in the\nfoe's face to inflict damage\nand lower its Accuracy."),
	MUDDYWATER ("Muddy Water", MoveType.SPECIAL, Type.WATER, false, 0.30, 10, 95, 85, -1, Arrays.asList("accuracy"), 
			"The user attacks by\nshooting out muddy water.\nIt may also lower the foe's\nAccuracy."),
	PAYBACK ("Payback", MoveType.PHYSICAL, Type.DARK, 10, 50, 100, 
			"If the user can use this\nattack after the foe\nattacks, its power is\ndoubled."),
	PETALBLIZZARD ("Petal Blizzard", MoveType.PHYSICAL, Type.GRASS, 15, 135, 100, 
			"The user stirs up a violent\npetal blizzard and attacks\neverything around it."),
	PLAYNICE ("Play Nice", MoveType.ATTRIBUTE, Type.NORMAL, false, 20, -1, -1, Arrays.asList("attack"), 
			"The user and the target\nbecome friends.\nThis lowers the target's\nAttack stat."),
	POISONPOWDER ("Poison Powder", MoveType.STATUS, Type.POISON, Status.POISON, 45, 75, 
			"A cloud of poisonous dust\nis scattered on the foe.\nIt may poison the target."),
	POUND ("Pound", MoveType.PHYSICAL, Type.NORMAL, 35, 40, 100, 
			"The foe is physically\npounded with a long tail or\na foreleg, etc."),
	PSYBEAM ("Psybeam", MoveType.SPECIAL, Type.PSYCHIC, Status.CONFUSE, 1.0, 20, 95, 100, 
			"The foe is attacked with a\npeculiar ray.\nIt may also leave the\ntarget confused."),
	PSYCHIC ("Psychic", MoveType.SPECIAL, Type.PSYCHIC, 10, 135, 100, 
			"The foe is hit by a strong\ntelekinetic force."),
	PSYCHOCUT ("Psycho Cut", MoveType.PHYSICAL, Type.PSYCHIC, 20, 105, 100, 1, 
			"The user tears at the foe\nwith blades formed by\npsychic power. Critical hits\nland more easily."),
	QUICKATTACK ("Quick Attack", MoveType.PHYSICAL, Type.NORMAL, 30, 40, 100, true, 
			"The user lunges at the foe\nat a speed that makes it\nalmost invisible. It is sure\nto strike first."),
	RAINDANCE ("Rain Dance", MoveType.WEATHER, Type.WATER, 5, 5, "RAIN",
			"The user summons a heavy\nrain that falls for five\nturns, powering up Water-\ntype moves."),
	RAZORLEAF ("Razor Leaf", MoveType.PHYSICAL, Type.GRASS, 25, 80, 95, 1, 
			"Sharp-edged leaves are\nlaunched to slash at the\nfoe. It has a high critical-\nhit ratio."),
	REST ("Rest", MoveType.ATTRIBUTE, Type.NORMAL, true, 10, -1, -1, null,
			"The user goes to sleep for\ntwo turns. It fully\nrestores the user's HP and\nheals any status problem."),
	ROCKTHROW ("Rock Throw", MoveType.PHYSICAL, Type.ROCK, 15, 75, 90, 
			"The user picks up and\nthrows a small rock at the\nfoe to attack."),
	ROLLOUT ("Rollout", MoveType.PHYSICAL, Type.ROCK, 20, 45, 90, 
			"The user continually rolls\ninto the foe over five\nturns."),
	SANDSTORM ("Sandstorm", MoveType.WEATHER, Type.ROCK, 10, 5, "SANDSTORM",
			"A five-turn sand-storm is\nsummoned to hurt all\ncombatant types except\nRock, Ground, and Steel."),
	SCARYFACE ("Scary Face", MoveType.ATTRIBUTE, Type.NORMAL, false, 10, 90, -2, Arrays.asList("speed"), 
			"The user frightens the foe\nwith a scary face to\nsharply reduce its Speed\nstat."),
	SCRATCH ("Scratch", MoveType.PHYSICAL, Type.NORMAL, 35, 40, 100, 
			"Hard, pointed, and sharp\nclaws rake the foe to\ninflict damage."),
	SCREECH ("Screech", MoveType.ATTRIBUTE, Type.NORMAL, false, 40, 85, -2, Arrays.asList("defense"),
			"An earsplitting screech is\nemitted to sharply reduce\nthe foe's Defense stat."),
	SEISMICTOSS ("Seismic Toss", MoveType.PHYSICAL, Type.FIGHTING, 20, -1, 100, 
			"The foe is thrown using the\npower of gravity.\nIt inflicts damage equal to\nthe user's level."),
	SHADOWBALL ("Shadow Ball", MoveType.SPECIAL, Type.GHOST, 15, 120, 100, 
			"The user hurls a shadowy\nblob at the foe."),
	SHADOWPUNCH ("Shadow Punch", MoveType.PHYSICAL, Type.GHOST, 20, 90, -1, 
			"The user throws a punch at\nthe foe from the shadows.\nThe punch lands without\nfail."),
	SHEERCOLD ("Sheer Cold", MoveType.SPECIAL, Type.ICE, 5, 1000, 30, 
			"The foe is attacked with a\nblast of absolute-zero\ncold. The foe instantly\nfaints if it hits."),
	SKULLBASH ("Skull Bash", MoveType.PHYSICAL, Type.NORMAL, 15, 100, 100, 1, false, false,
			"is\npreparing its attack...",
			"The user tucks in its head to\nraise its Defense in the\nfirst turn, then rams the foe\non the next turn."),
	SKYUPPERCUT ("Sky Uppercut", MoveType.PHYSICAL, Type.FIGHTING, 15, 120, 100, 
			"The user attacks the foe\nwith an uppercut thrown\nskyward with force."),
	SLAM ("Slam", MoveType.PHYSICAL, Type.NORMAL, 20, 80, 75, 
			"The foe is slammed with a\nlong tail, vines, etc., to\ninflict damage."),
	SLASH ("Slash", MoveType.PHYSICAL, Type.NORMAL, 20, 70, 100, 1, 
			"The foe is attacked with a\nslash of claws, etc.\nIt has a high critical-hit\nratio."),
	SLEEPPOWDER ("Sleep Powder", MoveType.STATUS, Type.GRASS, Status.SLEEP, 15, 75, 
			"The user scatters a big\ncloud of sleep-inducing dust\naround the target."),
	SLEEPTALK ("Sleep Talk", MoveType.SPECIAL, Type.NORMAL, 10, -1, -1, 
			"While it is asleep, the user\nrandomly uses one of the\nmoves it knows."),
	SLUDGEBOMB ("Sludge Bomb", MoveType.SPECIAL, Type.POISON, Status.POISON, 0.30, 10, 90, 100,
			"Unsanitary sludge is hurled\nat the target. It may also\npoison the target."),
	SMOKESCREEN ("Smokescreen", MoveType.ATTRIBUTE, Type.NORMAL, false, 20, 100, -1, Arrays.asList("accuracy"),
			"The user releases an obscur-\ning cloud of smoke or ink.\nIt reduces the target's\naccuracy."),
	SOLARBEAM ("Solar Beam", MoveType.SPECIAL, Type.GRASS, 10, 180, 100, 1, false, false,
			"is\ncharging a light beam...", 
			"A two-turn attack. The\nuser gathers light, then\nblasts a bundled beam on\nthe second turn."),
	STOMP ("Stomp", MoveType.PHYSICAL, Type.NORMAL, 0.30, 20, 65, 100, 
			"The foe is stomped with a big\nfoot. It may also make the\ntarget flinch."),
	STRUGGLE ("Struggle", MoveType.PHYSICAL, Type.NORMAL, 10, 50, 100, 0.25, 
			"struggle"),
	SUNNYDAY ("Sunny Day", MoveType.WEATHER, Type.FIRE, 5, 5, "SUNLIGHT",
			"The user intensifies the\nsun for five turns,\npowering up Fire-type moves."),
	SUPERSONIC("Supersonic", MoveType.STATUS, Type.NORMAL, Status.CONFUSE, 20, 55, 
			"The user generates odd\nsound waves from its body.\nIt may confuse the target."),
	SURF ("Surf", MoveType.SPECIAL, Type.WATER, 15, 95, 100, 
			"It swamps the entire\nbattlefield with a giant\nwave. It can also be used\nfor crossing water."),
	TACKLE ("Tackle", MoveType.PHYSICAL, Type.NORMAL, 35, 40, 95, 
			"A physical attack in which\nthe user charges and slams\ninto the foe with its whole\nbody."),
	TAILWHIP ("Tail Whip", MoveType.ATTRIBUTE, Type.NORMAL, false, 30, 100, -1, Arrays.asList("defense"), 
			"The user wags its tail\ncutely, making the foe less\nwary. The target's Defense\nstat is lowered."),
	TAKEDOWN ("Take Down", MoveType.PHYSICAL, Type.NORMAL, 20, 90, 85, 0.25, 
			"A reckless, full-body\ncharge attack for slamming\ninto the foe. It also\ndamages the user a little."),
	TELEPORT ("Teleport", MoveType.OTHER, Type.PSYCHIC, 20, 0, -1, 
			"Use it to flee from any wild\nPokémon."),
	THUNDER ("Thunder", MoveType.SPECIAL, Type.ELECTRIC, Status.PARALYZE, 0.10, 10, 120, 70, 
			"A wicked thunderbolt is\ndropped on the foe to\ninflict damage. It may also\nleave the target paralyzed."),
	THUNDERBOLT ("Thunder Bolt", MoveType.SPECIAL, Type.ELECTRIC, Status.PARALYZE, 0.10, 15, 135, 100, 
			"A strong electric blast is\nloosed at the foe.\nIt may also leave the foe\nparalyzed."),
	THUNDERFANG ("Thunder Fang", MoveType.PHYSICAL, Type.ELECTRIC, Status.PARALYZE, 0.10, 15, 65, 95, 
			"The user bites with electri-\nfied fangs. It may also make\nthe foe paralyzed."),
	THUNDERPUNCH ("Thunder Punch", MoveType.PHYSICAL, Type.ELECTRIC, Status.PARALYZE, 0.10, 15, 110, 100, 
			"The foe is punched with an\nelectrified fist.\nIt may leave the target\nwith paralysis."),
	THUNDERSHOCK ("Thunder Shock", MoveType.SPECIAL, Type.ELECTRIC, Status.PARALYZE, 0.10, 40, 60, 100, 
			"A jolt of electric is hurled\nat the foe to inflict\ndamage. It may also leave\nthe foe paralyzed."),
	THUNDERWAVE ("Thunder Wave", MoveType.STATUS, Type.ELECTRIC, Status.PARALYZE, 20, 90, 
			"A weak eletric charge is\nlaunched at the foe.\nIt causes paralysis if it\nhits."),
	TWISTER ("Twister", MoveType.SPECIAL, Type.DRAGON, 20, 40, 100, 
			"The user whips up a vicious\ntornado to tear at the foe."),
	VINEWHIP ("Vine Whip", MoveType.PHYSICAL, Type.GRASS, 25, 65, 100, 
			"The foe is struck with\nslender, whiplike vines to\ninflict damage."),
	VITALTHROW ("Vital Throw", MoveType.PHYSICAL, Type.FIGHTING, 10, 105, -1, 
			"The user allows the foe to\nattack first. In return,\nthis throw move is guaran-\nteed not to miss."),
	VOLTTACKLE ("Volt Tackle", MoveType.PHYSICAL, Type.ELECTRIC, 15, 120, 100, 0.33,
			"The user electrifies itself,\nthen charges at the foe. It\ncauses considerable damage\nto the user as well."), 
	WATERGUN ("Water Gun", MoveType.SPECIAL, Type.WATER, 25, 60, 100, 
			"The foe is blasted with a\nforceful shot of water."),
	WATERPULSE ("Water Pulse", MoveType.SPECIAL, Type.WATER, 20, 90, 100, 
			"The user attacks the foe\nwith a pulsing blast of\nwater. It may also confuse\nthe foe."),
	WINGATTACK ("Wing Attack", MoveType.PHYSICAL, Type.FLYING, 35, 60, 100,
			"The foe is struck with\nlarge, imposing wings spread\nwide to inflict damage."),
	XSCISSOR ("X-scissor", MoveType.PHYSICAL, Type.BUG, 15, 80, 100, 
			"The user slashes at the foe\nby crossing its scythes or\nclaws as if they were a pair\nof scissors."),
	YAWN ("Yawn", MoveType.STATUS, Type.NORMAL, Status.SLEEP, 10, 100, 
			"The user lets loose a huge\nyawn that lulls the foe into\nfalling asleep.");
	/** END INITIALIZE ENUMS **/
	
	public static final List<Moves> allMoves;
	static {
		allMoves = new ArrayList<Moves>(EnumSet.allOf(Moves.class));
	}
	
	/** INITIALIZE VALUES **/
	private String name, weather, delay, info;
	private MoveType mType;
	private Type type;
	private Status effect;
	private int pp, power, accuracy, level, crit, turns;
	private boolean goFirst, toSelf, isProtected, recharge;
	private double probability, damageToSelf, flinch;		
	private List<String> stats;
	/** END INITIALIZE VALUES **/	
		
	/** CONSTRUCTORS **/
	Moves (String name, MoveType mType, Type type, 
			Status effect, double probability,
			List<String> stats, boolean toSelf,  
			int pp, int power, int accuracy, int level, int crit, int turns,
			double damageToSelf, double flinch,		
			boolean goFirst, boolean isProtected, boolean recharge,
			String weather, String delay, String info) {
		this.name = name;
		this.mType = mType;
		
		this.type = type;
		this.effect = effect;		
		this.probability = probability;
		
		this.stats = stats;
		this.toSelf = toSelf;
		
		this.pp = pp;
		this.power = power;
		this.accuracy = accuracy;
		this.level = level;
		this.crit = crit;
		this.turns = turns;
		
		this.goFirst = goFirst;
		this.isProtected = isProtected;
		this.recharge = recharge;
		
		this.damageToSelf = damageToSelf;
		this.flinch = flinch;
		
		this.weather = weather;
		this.delay = delay;
		this.info = info;
	}	
	Moves (String name, MoveType mType, Type type, int pp, int power, int accuracy, String info) {

		this(name, mType, type, 
				null, 0.0, 
				null, false, 
				pp, power, accuracy, 0, 0, 0, 
				0.0, 0.0, 
				false, false, false,
				"", "", info);
	}	
	Moves (String name, MoveType mType, Type type, double flinch, int pp, int power, int accuracy, String info) {

		this(name, mType, type, 
				null, 0.0, 
				null, false, 
				pp, power, accuracy, 0, 0, 0, 
				0.0, flinch, 
				false, false, false,
				"", "", info);
	}	
	Moves (String name, MoveType mType, Type type, int pp, int power, int accuracy, double damageToSelf, String info) {
		this(name, mType, type, 
				null, 0.0, 
				null, false, 
				pp, power, accuracy, 0, 0, 0, 
				damageToSelf, 0.0, 
				false, false, false,
				"", "", info);
	}	
	Moves (String name, MoveType mType, Type type, int pp, int power, int accuracy, int crit, String info) {
		this(name, mType, type, 
				null, 0.0, 
				null, false, 
				pp, power, accuracy, 0, crit, 0, 
				0.0, 0.0, 
				false, false, false,
				"", "", info);
	}	
	Moves (String name, MoveType mType, Type type, int pp, int power, int accuracy, boolean goFirst, String info) {
		this(name, mType, type, 
				null, 0.0, 
				null, false, 
				pp, power, accuracy, 0, 0, 0, 
				0.0, 0.0, 
				goFirst, false, false,
				"", "", info);
	}	
	Moves (String name, MoveType mType, Type type, int pp, int power, int accuracy, int turns, boolean isProtected, boolean recharge, String delay, String info) {
		this(name, mType, type, 
				null, 0.0, 
				null, false, 
				pp, power, accuracy, 0, 0, turns, 
				0.0, 0.0, 
				false, isProtected, recharge,
				"", delay, info);
	}
	Moves (String name, MoveType mType, Type type, Status effect, int pp, int accuracy, String info) {
		this(name, mType, type, 
				effect, 0.0, 
				null, false, 
				pp, 0, accuracy, 0, 0, 0, 
				0.0, 0.0, 
				false, false, false,
				"", "", info);
	}	
	Moves (String name, MoveType mType, Type type, Status effect, double probability, int pp, int power, int accuracy, String info) {
		this(name, mType, type, 
				effect, probability, 
				null, false, 
				pp, power, accuracy, 0, 0, 0,
				0.0, 0.0, 
				false, false, false,
				"", "", info);
	}	
	Moves (String name, MoveType mType, Type type, Status effect, double probability, double flinch, int pp, int power, int accuracy, String info) {
		this(name, mType, type, 
				effect, probability, 
				null, false, 
				pp, power, accuracy, 0, 0, 0, 
				0.0, flinch, 
				false, false, false,
				"", "", info);
	}	
	Moves (String name, MoveType mType, Type type, Status effect, double probability, int pp, int power, int accuracy, int crit, String info) {
		this(name, mType, type, 
				effect, probability, 
				null, false, 
				pp, power, accuracy, 0, crit, 0, 
				0.0, 0.0, 
				false, false, false,
				"", "", info);
	}	
	Moves (String name, MoveType mType, Type type, boolean toSelf, int pp, int accuracy, int level, List<String> stats, String info) {
		this(name, mType, type, 
				null, 0.0, 
				stats, toSelf, 
				pp, 0, accuracy, level, 0, 0, 
				0.0, 0.0, 
				false, false, false,
				"", "", info);
	}	
	Moves (String name, MoveType mType, Type type, boolean toSelf, double probability, int pp, int power, int accuracy, int level, List<String> stats, String info) {
		this(name, mType, type, 
				null, probability, 
				stats, toSelf, 
				pp, power, accuracy, level, 0, 0, 
				0.0, 0.0, 
				false, false, false,
				"", "", info);
	}
	Moves (String name, MoveType mType, Type type, int pp, int turns, String weather, String info) {
		this(name, mType, type, 
				null, 0.0, 
				null, false, 
				pp, 0, -1, 0, 0, turns, 
				0.0, 0.0, 
				false, false, false,
				weather, "", info);
	}	
	/** END CONSTRUCTORS **/
	
	/** GETTERS **/
	public String getName() { return name; }
	public MoveType getMType() { return mType; }	
	public Type getType() { return type; }
	public int getpp() { return pp; }
	public Status getEffect() { return effect; }	
	public double getProbability() { return probability; }	
	public double getFlinch() { return flinch; }	
	public double getSelfInflict() { return damageToSelf; }	
	public boolean isToSelf() { return toSelf; }	
	public int getAccuracy() { 
		if (accuracy == -1) return 100;
		else return accuracy; 
	}
	public int getPower() {	return power; }	
	public int getTurns() { return turns; }
	public boolean getGoFirst() { return goFirst; }	
	public boolean getProtected() { return isProtected; }
	public boolean getRecharge() { return recharge; }
	public String getWeather() { return weather; }	
	public String getDelay(String name) { return name + " " + delay; }	
	public String getInfo() {	return info; }	
	public int getCrit() { return crit; }	
	public int getLevel() { return level; }	
	public List<String> getStats() { return stats; }
	/** END GETTERS **/
}
/*** END MOVES ENUM ***/