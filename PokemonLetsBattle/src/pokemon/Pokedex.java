package pokemon;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;

import application.GamePanel;
import moves.*;
import pokemon.Pokemon.Growth;
import properties.*;


/*** POKEDEX ENUM CLASS ***/
public enum Pokedex {	
	/** STAT, ABILITY, AND MOVE REFERECE: https://www.serebii.net/pokemon/ **/
	/** EXP & EV REFERENCE: https://bulbapedia.bulbagarden.net/wiki/List_of_Pok%C3%A9mon_by_effort_value_yield_in_Generation_IV **/
	/** XP GROWTH REFERENCE: https://bulbapedia.bulbagarden.net/wiki/List_of_Pok%C3%A9mon_by_experience_type **/	
	/** CATCH RATE REFERENCE: https://bulbapedia.bulbagarden.net/wiki/List_of_Pokémon_by_catch_rate **/	
	
	
	BULBASAUR ("Bulbasaur", 1, Type.GRASS, Ability.OVERGROW, 45, 49, 49, 65, 65, 45, 16, 2, 64, 1, Growth.MEDIUMSLOW, 45,
			Map.ofEntries(
					Map.entry(3, Moves.GROWL),
					Map.entry(7, Moves.LEECHSEED),
					Map.entry(9, Moves.VINEWHIP),
					Map.entry(13, Moves.POISONPOWDER),
					Map.entry(14, Moves.SLEEPPOWDER),
					Map.entry(15, Moves.TAKEDOWN),
					Map.entry(19, Moves.RAZORLEAF),
					Map.entry(21, Moves.SWEETSCENT),
					Map.entry(25, Moves.GROWTH),
					Map.entry(27, Moves.DOUBLEEDGE),
					Map.entry(37, Moves.SEEDBOMB)
			)),
	IVYSAUR ("Ivysaur", 2, Arrays.asList(Type.GRASS, Type.POISON), Ability.OVERGROW, 60, 62, 63, 80, 80, 60, 32, 3, 141, 2, Growth.MEDIUMSLOW, 45, 
			Map.ofEntries(					
					Map.entry(3, Moves.GROWL),
					Map.entry(7, Moves.LEECHSEED),
					Map.entry(13, Moves.POISONPOWDER),
					Map.entry(14, Moves.SLEEPPOWDER),
					Map.entry(15, Moves.TAKEDOWN),
					Map.entry(20, Moves.RAZORLEAF),
					Map.entry(23, Moves.SWEETSCENT),
					Map.entry(28, Moves.GROWTH),
					Map.entry(31, Moves.DOUBLEEDGE),
					Map.entry(44, Moves.SOLARBEAM)
			)),
	VENUSAUR ("Venusaur", 3, Arrays.asList(Type.GRASS, Type.POISON), Ability.OVERGROW, 80, 82, 83, 100, 100, 80, -1, -1, 208, 3, Growth.MEDIUMSLOW, 45,
			Map.ofEntries(					
					Map.entry(3, Moves.GROWL),
					Map.entry(7, Moves.LEECHSEED),
					Map.entry(9, Moves.VINEWHIP),
					Map.entry(13, Moves.POISONPOWDER),
					Map.entry(14, Moves.SLEEPPOWDER),
					Map.entry(15, Moves.TAKEDOWN),
					Map.entry(20, Moves.RAZORLEAF),
					Map.entry(23, Moves.SWEETSCENT),
					Map.entry(28, Moves.GROWTH),
					Map.entry(31, Moves.DOUBLEEDGE),
					Map.entry(32, Moves.PETALDANCE),
					Map.entry(37, Moves.SEEDBOMB),
					Map.entry(53, Moves.SOLARBEAM)
			)),
	CHARMANDER ("Charmander", 4, Type.FIRE, Ability.BLAZE, 39, 52, 43, 60, 50, 65, 16, 5, 65, 1, Growth.MEDIUMSLOW, 45,
			Map.ofEntries(
					Map.entry(7, Moves.EMBER),
					Map.entry(10, Moves.SMOKESCREEN),
					Map.entry(16, Moves.DRAGONRAGE),
					Map.entry(19, Moves.SCARYFACE),
					Map.entry(25, Moves.FIREFANG),
					Map.entry(28, Moves.SLASH),
					Map.entry(34, Moves.FLAMETHROWER),
					Map.entry(37, Moves.FIRESPIN)
			)),
	CHARMELEON ("Charmeleon", 5, Type.FIRE, Ability.BLAZE, 58, 64, 58, 80, 65, 80, 36, 6, 142, 2, Growth.MEDIUMSLOW, 45,
			Map.ofEntries(
					Map.entry(7, Moves.EMBER),
					Map.entry(10, Moves.SMOKESCREEN),
					Map.entry(17, Moves.DRAGONRAGE),
					Map.entry(21, Moves.SCARYFACE),
					Map.entry(28, Moves.FIREFANG),
					Map.entry(32, Moves.SLASH),
					Map.entry(39, Moves.FLAMETHROWER),
					Map.entry(43, Moves.FIRESPIN)
			)),
	CHARIZARD ("Charizard", 6, Arrays.asList(Type.FIRE, Type.FLYING), Ability.BLAZE, 78, 84, 78, 109, 85, 100, -1, -1, 209, 3, Growth.MEDIUMSLOW, 45,
			Map.ofEntries(
					Map.entry(7, Moves.EMBER),
					Map.entry(10, Moves.SMOKESCREEN),
					Map.entry(17, Moves.DRAGONRAGE),
					Map.entry(21, Moves.SCARYFACE),
					Map.entry(28, Moves.FIREFANG),
					Map.entry(32, Moves.SLASH),
					Map.entry(36, Moves.WINGATTACK),
					Map.entry(42, Moves.FLAMETHROWER),
					Map.entry(49, Moves.FIRESPIN),
					Map.entry(59, Moves.HEATWAVE),
					Map.entry(66, Moves.FLAREBLITZ)
			)),
	SQUIRTLE ("Squirtle", 7, Type.WATER, Ability.TORRENT, 44, 48, 65, 50, 64, 43, 16, 8, 66, 1, Growth.MEDIUMSLOW, 45,
			Map.ofEntries(
					Map.entry(4, Moves.TAILWHIP),
					Map.entry(7, Moves.BUBBLE),
					Map.entry(10, Moves.WITHDRAW),
					Map.entry(13, Moves.WATERGUN),
					Map.entry(16, Moves.BITE),
					Map.entry(19, Moves.RAPIDSPIN),
					Map.entry(22, Moves.PROTECT),
					Map.entry(25, Moves.WATERPULSE),
					Map.entry(28, Moves.AQUATAIL),
					Map.entry(31, Moves.SKULLBASH),
					Map.entry(34, Moves.RAINDANCE),
					Map.entry(37, Moves.HYDROPUMP)
			)),
	WARTORTLE ("Wartortle", 8, Type.WATER, Ability.TORRENT, 59, 63, 80, 65, 80, 58, 36, 9, 143, 2, Growth.MEDIUMSLOW, 45,
			Map.ofEntries(
					Map.entry(4, Moves.TAILWHIP),
					Map.entry(7, Moves.BUBBLE),
					Map.entry(10, Moves.WITHDRAW),
					Map.entry(13, Moves.WATERGUN),
					Map.entry(16, Moves.BITE),
					Map.entry(20, Moves.RAPIDSPIN),
					Map.entry(24, Moves.PROTECT),
					Map.entry(28, Moves.WATERPULSE),
					Map.entry(32, Moves.AQUATAIL),
					Map.entry(36, Moves.SKULLBASH),
					Map.entry(40, Moves.RAINDANCE),
					Map.entry(44, Moves.HYDROPUMP)
			)),
	BLASTOISE ("Blastoise", 9, Type.WATER, Ability.TORRENT, 79, 83, 100, 85, 105, 78, -1, -1, 210, 3, Growth.MEDIUMSLOW, 45,
			Map.ofEntries(
					Map.entry(4, Moves.TAILWHIP),
					Map.entry(7, Moves.BUBBLE),
					Map.entry(10, Moves.WITHDRAW),
					Map.entry(13, Moves.WATERGUN),
					Map.entry(16, Moves.BITE),
					Map.entry(20, Moves.RAPIDSPIN),
					Map.entry(24, Moves.PROTECT),
					Map.entry(28, Moves.WATERPULSE),
					Map.entry(32, Moves.AQUATAIL),
					Map.entry(39, Moves.SKULLBASH),
					Map.entry(46, Moves.RAINDANCE),
					Map.entry(53, Moves.HYDROPUMP)
			)),
	PIKACHU ("Pikachu", 25, Type.ELECTRIC, Ability.STATIC, 55, 55, 40, 50, 50, 90, 30, 26, 82, 2, Growth.MEDIUMFAST, 190,
			Map.ofEntries(
					Map.entry(5, Moves.TAILWHIP),
					Map.entry(10, Moves.THUNDERWAVE),
					Map.entry(13, Moves.QUICKATTACK),
					Map.entry(18, Moves.DOUBLETEAM),
					Map.entry(21, Moves.SLAM),
					Map.entry(26, Moves.THUNDERBOLT),
					Map.entry(34, Moves.AGILITY),
					Map.entry(37, Moves.DISCHARGE),
					Map.entry(45, Moves.THUNDER)
			)),
	RAICHU ("Raichu", 26, Type.ELECTRIC, Ability.STATIC, 60, 90, 55, 90, 80, 110, -1, -1, 122, 3, Growth.MEDIUMFAST, 75, null),
	ZUBAT ("Zubat", 41, Arrays.asList(Type.FLYING, Type.POISON), Ability.INNERFOCUS, 40, 45, 35, 30, 40, 55, 22, 42, 54, 1, Growth.MEDIUMFAST, 255, 
			Map.ofEntries(
					Map.entry(5, Moves.SUPERSONIC),
					Map.entry(9, Moves.ASTONISH),
					Map.entry(13, Moves.BITE),
					Map.entry(17, Moves.WINGATTACK),
					Map.entry(21, Moves.CONFUSERAY),
					Map.entry(25, Moves.AIRCUTTER),
//					Map.entry(29, Moves.MEANLOOK),
					Map.entry(33, Moves.POISONFANG),
					Map.entry(37, Moves.HAZE),
					Map.entry(41, Moves.AIRSLASH)
					
			)),
	GOLBAT ("Golbat", 42, Arrays.asList(Type.FLYING, Type.POISON), Ability.INNERFOCUS, 75, 80, 70, 65, 75, 90, 40, 169, 171, 2, Growth.MEDIUMFAST, 90, 
			Map.ofEntries(
					Map.entry(5, Moves.SUPERSONIC),
					Map.entry(9, Moves.ASTONISH),
					Map.entry(13, Moves.BITE),
					Map.entry(17, Moves.WINGATTACK),
					Map.entry(21, Moves.CONFUSERAY),
					Map.entry(27, Moves.AIRCUTTER),
//					Map.entry(33, Moves.MEANLOOK),
					Map.entry(39, Moves.POISONFANG),
					Map.entry(45, Moves.HAZE),
					Map.entry(51, Moves.AIRSLASH)
					
			)),
	GROWLITHE ("Growlithe", 58, Type.FIRE, Ability.FLASHFIRE, 55, 70, 45, 70, 50, 60, 26, 59, 91, 1, Growth.SLOW, 190, 
			Map.ofEntries(
					Map.entry(6, Moves.EMBER),
					Map.entry(9, Moves.LEER),
					Map.entry(14, Moves.ODORSLEUTH),
					Map.entry(20, Moves.FLAMEWHEEL),
					Map.entry(25, Moves.REVERSAL),
					Map.entry(28, Moves.FIREFANG),
					Map.entry(31, Moves.TAKEDOWN),
					Map.entry(34, Moves.FLAMETHROWER),
					Map.entry(39, Moves.AGILITY),
					Map.entry(42, Moves.CRUNCH),
					Map.entry(45, Moves.HEATWAVE),
					Map.entry(48, Moves.FLAREBLITZ)
					
			)),
	ARCANINE ("Arcanine", 59, Type.FIRE, Ability.FLASHFIRE, 90, 110, 80, 100, 80, 95, -1, -1, 213, 2, Growth.SLOW, 75, 
			Map.ofEntries(
					Map.entry(39, Moves.EXTREMESPEED)					
			)),
	ABRA ("Abra", 63, Type.PSYCHIC, Ability.INNERFOCUS, 25, 20, 15, 105, 55, 90, 16, 64, 75, 1, Growth.MEDIUMSLOW, 200, null),
	KADABRA ("Kadabra", 64, Type.PSYCHIC, Ability.INNERFOCUS, 40, 35, 30, 120, 70, 105, 36, 65, 145, 2, Growth.MEDIUMSLOW, 100,
			Map.ofEntries(
					Map.entry(16, Moves.CONFUSION),
					Map.entry(24, Moves.PSYBEAM),
					Map.entry(30, Moves.RECOVER),
					Map.entry(34, Moves.PSYCHOCUT),
					Map.entry(40, Moves.PSYCHIC)
			)),
	ALAKAZAM ("Alakazam", 65, Type.PSYCHIC, Ability.INNERFOCUS, 55, 50, 45, 135, 95, 120, -1, -1, 186, 3, Growth.MEDIUMSLOW, 50,
			Map.ofEntries(
					Map.entry(16, Moves.CONFUSION),
					Map.entry(24, Moves.PSYBEAM),
					Map.entry(30, Moves.RECOVER),
					Map.entry(34, Moves.PSYCHOCUT),
					Map.entry(36, Moves.CALMMIND),
					Map.entry(40, Moves.PSYCHIC)
			)),
	MACHOP ("Machop", 66, Type.FIGHTING, Ability.GUTS, 70, 80, 50, 35, 35, 35, 28, 67, 75, 1, Growth.MEDIUMSLOW, 180,
			Map.ofEntries(
					Map.entry(10, Moves.KARATECHOP),
					Map.entry(19, Moves.SEISMICTOSS),
//					Map.entry(22, Moves.REVENGE),
					Map.entry(25, Moves.VITALTHROW),
					Map.entry(31, Moves.SUBMISSION),
					Map.entry(34, Moves.WAKEUPSLAP),
					Map.entry(37, Moves.CROSSCHOP),
					Map.entry(43, Moves.SCARYFACE),
					Map.entry(46, Moves.DYNAMICPUNCH)
			)),
	MACHOKE ("Machoke", 67, Type.FIGHTING, Ability.GUTS, 80, 100, 70, 50, 60, 45, 40, 68, 146, 2, Growth.MEDIUMSLOW, 90,
			Map.ofEntries(
					Map.entry(10, Moves.KARATECHOP),
					Map.entry(19, Moves.SEISMICTOSS),
//					Map.entry(22, Moves.REVENGE),
					Map.entry(25, Moves.VITALTHROW),
					Map.entry(32, Moves.SUBMISSION),
					Map.entry(36, Moves.WAKEUPSLAP),
					Map.entry(40, Moves.CROSSCHOP),
					Map.entry(44, Moves.SCARYFACE),
					Map.entry(51, Moves.DYNAMICPUNCH)
			)),
	MACHAMP ("Machamp", 68, Type.FIGHTING, Ability.GUTS, 90, 130, 80, 65, 85, 55, -1, -1, 193, 3, Growth.MEDIUMSLOW, 45,
			Map.ofEntries(
					Map.entry(10, Moves.KARATECHOP),
					Map.entry(19, Moves.SEISMICTOSS),
//					Map.entry(22, Moves.REVENGE),
					Map.entry(25, Moves.VITALTHROW),
					Map.entry(32, Moves.SUBMISSION),
					Map.entry(36, Moves.WAKEUPSLAP),
					Map.entry(40, Moves.CROSSCHOP),
					Map.entry(44, Moves.SCARYFACE),
					Map.entry(51, Moves.DYNAMICPUNCH)
			)),
	GEODUDE ("Geodude", 74, Arrays.asList(Type.ROCK, Type.GROUND), Ability.ROCKHEAD, 40, 80, 100, 30, 30, 20, 25, 75, 73, 1, Growth.MEDIUMSLOW, 255,
			Map.ofEntries(
					Map.entry(8, Moves.ROCKPOLISH),
					Map.entry(11, Moves.ROCKTHROW),
					Map.entry(15, Moves.MAGNITUDE),
					Map.entry(18, Moves.SELFDESTRUCT),
					Map.entry(22, Moves.ROLLOUT),
					Map.entry(25, Moves.ROCKBLAST),
					Map.entry(29, Moves.EARTHQUAKE),
					Map.entry(32, Moves.EXPLOSION),
					Map.entry(36, Moves.DOUBLEEDGE),
					Map.entry(39, Moves.STONEEDGE)
			)),
	GRAVELER ("Graveler", 75, Arrays.asList(Type.ROCK, Type.GROUND), Ability.ROCKHEAD, 55, 95, 115, 45, 45, 35, 40, 76, 134, 2, Growth.MEDIUMSLOW, 120,
			Map.ofEntries(
					Map.entry(8, Moves.ROCKPOLISH),
					Map.entry(11, Moves.ROCKTHROW),
					Map.entry(15, Moves.MAGNITUDE),
					Map.entry(18, Moves.SELFDESTRUCT),
					Map.entry(22, Moves.ROLLOUT),
					Map.entry(27, Moves.ROCKBLAST),
					Map.entry(33, Moves.EARTHQUAKE),
					Map.entry(38, Moves.EXPLOSION),
					Map.entry(44, Moves.DOUBLEEDGE),
					Map.entry(49, Moves.STONEEDGE)
			)),
	GOLEM ("Golem", 76, Arrays.asList(Type.ROCK, Type.GROUND), Ability.LEVITATE, 80, 120, 130, 55, 65, 45, -1, -1, 177, 3, Growth.MEDIUMSLOW, 45,
			Map.ofEntries(
					Map.entry(8, Moves.ROCKPOLISH),
					Map.entry(11, Moves.ROCKTHROW),
					Map.entry(15, Moves.MAGNITUDE),
					Map.entry(18, Moves.SELFDESTRUCT),
					Map.entry(22, Moves.ROLLOUT),
					Map.entry(27, Moves.ROCKBLAST),
					Map.entry(33, Moves.EARTHQUAKE),
					Map.entry(38, Moves.EXPLOSION),
					Map.entry(44, Moves.DOUBLEEDGE),
					Map.entry(49, Moves.STONEEDGE)
			)),
	PONYTA ("Ponyta", 77, Type.FIRE, Ability.FLASHFIRE, 50, 85, 55, 65, 65, 90, 45, 78, 152, 1, Growth.MEDIUMFAST, 190,
			Map.ofEntries(
					Map.entry(7, Moves.GROWL),
					Map.entry(10, Moves.TAILWHIP),
					Map.entry(16, Moves.EMBER),
					Map.entry(19, Moves.STOMP),
					Map.entry(25, Moves.FIRESPIN),
					Map.entry(28, Moves.TAKEDOWN),
					Map.entry(34, Moves.AGILITY),
					Map.entry(38, Moves.FIREBLAST),
					Map.entry(44, Moves.BOUNCE),
					Map.entry(48, Moves.FLAREBLITZ)
			)),
	RAPIDASH ("Rapidash", 78, Type.FIRE, Ability.FLASHFIRE, 65, 100, 70, 80, 80, 105, -1, -1, 192, 2, Growth.MEDIUMFAST, 60,
			Map.ofEntries(
					Map.entry(7, Moves.GROWL),
					Map.entry(10, Moves.TAILWHIP),
					Map.entry(16, Moves.EMBER),
					Map.entry(19, Moves.STOMP),
					Map.entry(25, Moves.FIRESPIN),
					Map.entry(28, Moves.TAKEDOWN),
					Map.entry(34, Moves.AGILITY),
					Map.entry(38, Moves.FIREBLAST),
					Map.entry(40, Moves.FURYATTACK),
					Map.entry(49, Moves.BOUNCE),
					Map.entry(58, Moves.FLAREBLITZ)
			)),
	GASTLY ("Gastly", 92, Arrays.asList(Type.GHOST, Type.POISON), Ability.LEVITATE, 30, 35, 30, 100, 35, 80, 25, 93, 95, 1, Growth.MEDIUMSLOW, 190,
			Map.ofEntries(
					Map.entry(15, Moves.NIGHTSHADE),
					Map.entry(19, Moves.CONFUSERAY),
					Map.entry(22, Moves.SUCKERPUNCH),
					Map.entry(26, Moves.PAYBACK),
					Map.entry(29, Moves.SHADOWBALL),
					Map.entry(33, Moves.DREAMEATER),
					Map.entry(36, Moves.DARKPULSE)
			)),
	HAUNTER ("Haunter", 93, Arrays.asList(Type.GHOST, Type.POISON), Ability.LEVITATE, 45, 50, 45, 115, 55, 96, 40, 94, 126, 2, Growth.MEDIUMSLOW, 90,
			Map.ofEntries(
					Map.entry(15, Moves.NIGHTSHADE),
					Map.entry(19, Moves.CONFUSERAY),
					Map.entry(22, Moves.SUCKERPUNCH),
					Map.entry(25, Moves.SHADOWPUNCH),
					Map.entry(28, Moves.PAYBACK),
					Map.entry(33, Moves.SHADOWBALL),
					Map.entry(39, Moves.DREAMEATER),
					Map.entry(44, Moves.DARKPULSE)
			)),
	GENGAR ("Gengar", 94, Arrays.asList(Type.GHOST, Type.POISON), Ability.LEVITATE, 60, 65, 60, 130, 75, 110, -1, -1, 190, 3, Growth.MEDIUMSLOW, 45,
			Map.ofEntries(
					Map.entry(15, Moves.NIGHTSHADE),
					Map.entry(19, Moves.CONFUSERAY),
					Map.entry(22, Moves.SUCKERPUNCH),
					Map.entry(25, Moves.SHADOWPUNCH),
					Map.entry(28, Moves.PAYBACK),
					Map.entry(33, Moves.SHADOWBALL),
					Map.entry(39, Moves.DREAMEATER),
					Map.entry(44, Moves.DARKPULSE)
			)),	
	HITMONLEE ("Hitmonlee", 106, Type.FIGHTING, Ability.LIMBER, 50, 120, 53, 35, 110, 87, -1, -1, 139, 2, Growth.MEDIUMFAST, 45, 
			Map.ofEntries(
					Map.entry(5, Moves.MEDITATE),
					Map.entry(9, Moves.ROLLINGKICK),
					Map.entry(13, Moves.JUMPKICK),
					Map.entry(17, Moves.BRICKBREAK),
//					Map.entry(21, Moves.FOCUSENERGY),
					Map.entry(25, Moves.FEINT),
					Map.entry(29, Moves.HIGHJUMPKICK),
//					Map.entry(33, Moves.MINDREADER),
					Map.entry(37, Moves.FORESIGHT),
					Map.entry(41, Moves.BLAZEKICK),
					Map.entry(45, Moves.ENDURE),
					Map.entry(49, Moves.MEGAKICK),
					Map.entry(53, Moves.CLOSECOMBAT),
					Map.entry(57, Moves.REVERSAL)
			)),
	HITMONCHAN ("Hitmonchan", 107, Type.FIGHTING, Ability.KEENEYE, 50, 105, 79, 35, 110, 76, -1, -1, 140, 2, Growth.MEDIUMFAST, 45, 
			Map.ofEntries(
					Map.entry(6, Moves.AGILITY),
					Map.entry(11, Moves.PURSUIT),
					Map.entry(16, Moves.MACHPUNCH),
					Map.entry(17, Moves.BULLETPUNCH),
					Map.entry(21, Moves.FEINT),
					Map.entry(26, Moves.VACUUMWAVE),
					Map.entry(32, Moves.THUNDERPUNCH),
					Map.entry(33, Moves.ICEPUNCH),
					Map.entry(34, Moves.FIREPUNCH),
					Map.entry(36, Moves.SKYUPPERCUT),
					Map.entry(41, Moves.MEGAPUNCH),
					Map.entry(46, Moves.DETECT),
//					Map.entry(51, Moves.COUNTER),
					Map.entry(56, Moves.CLOSECOMBAT)
					
			)),
	HORSEA ("Horsea", 116, Type.WATER, Ability.SNIPER, 30, 40, 70, 70, 25, 60, 32, 117, 83, 1, Growth.MEDIUMFAST, 225,
			Map.ofEntries(
					Map.entry(4, Moves.SMOKESCREEN),
					Map.entry(8, Moves.LEER),
					Map.entry(11, Moves.WATERGUN),
					Map.entry(18, Moves.BUBBLEBEAM),
					Map.entry(23, Moves.AGILITY),
					Map.entry(26, Moves.TWISTER),
					Map.entry(30, Moves.BRINE),
					Map.entry(35, Moves.HYDROPUMP),
					Map.entry(38, Moves.DRAGONDANCE),
					Map.entry(42, Moves.DRAGONPULSE)
			)),
	SEADRA ("Seadra", 117, Type.WATER, Ability.SNIPER, 55, 65, 95, 95, 45, 85, 45, 230, 155, 2, Growth.MEDIUMFAST, 75,
			Map.ofEntries(
					Map.entry(4, Moves.SMOKESCREEN),
					Map.entry(8, Moves.LEER),
					Map.entry(11, Moves.WATERGUN),
					Map.entry(18, Moves.BUBBLEBEAM),
					Map.entry(23, Moves.AGILITY),
					Map.entry(26, Moves.TWISTER),
					Map.entry(30, Moves.BRINE),
					Map.entry(40, Moves.HYDROPUMP),
					Map.entry(48, Moves.DRAGONDANCE),
					Map.entry(57, Moves.DRAGONPULSE)
			)),
	MAGIKARP ("Magikarp", 129, Type.WATER, Ability.SWIFTSWIM, 20, 10, 55, 15, 20, 80, 20, 130, 20, 1, Growth.SLOW, 255,
			Map.ofEntries(
					Map.entry(15, Moves.TACKLE),
					Map.entry(30, Moves.FLAIL)
			)),
	GYARADOS ("Gyarados", 130, Arrays.asList(Type.WATER, Type.DRAGON), Ability.INTIMIDATE, 95, 125, 79, 60, 100, 81, -1, -1, 214, 2, Growth.SLOW, 45,
			Map.ofEntries(
					Map.entry(20, Moves.BITE),
					Map.entry(23, Moves.DRAGONRAGE),
					Map.entry(26, Moves.LEER),
					Map.entry(29, Moves.TWISTER),
					Map.entry(32, Moves.ICEFANG),
					Map.entry(35, Moves.AQUATAIL),
					Map.entry(38, Moves.RAINDANCE),
					Map.entry(41, Moves.HYDROPUMP),
					Map.entry(44, Moves.DRAGONDANCE),
					Map.entry(47, Moves.HYPERBEAM)
			)),
	LAPRAS ("Lapras", 131, Arrays.asList(Type.WATER, Type.ICE), Ability.SHELLARMOR, 130, 85, 80, 85, 95, 60, -1, -1, 219, 2, Growth.SLOW, 45,
			Map.ofEntries(
					Map.entry(7, Moves.CONFUSERAY),
					Map.entry(10, Moves.ICESHARD),
					Map.entry(14, Moves.WATERPULSE),
					Map.entry(18, Moves.BODYSLAM),
					Map.entry(22, Moves.RAINDANCE),
					Map.entry(32, Moves.ICEBEAM),
					Map.entry(37, Moves.BRINE),
					Map.entry(49, Moves.HYDROPUMP),
					Map.entry(55, Moves.SHEERCOLD)
			)),
	SNORLAX ("Snorlax", 143, Type.NORMAL, Ability.THICKFAT, 160, 110, 65, 65, 110, 30, -1, -1, 154, 2, Growth.SLOW, 25,
			Map.ofEntries(
					Map.entry(4, Moves.DEFENSECURL),
					Map.entry(9, Moves.AMNESIA),
					Map.entry(12, Moves.LICK),
					Map.entry(20, Moves.YAWN),
					Map.entry(25, Moves.REST),
					Map.entry(28, Moves.SNORE),
					Map.entry(29, Moves.SLEEPTALK),
					Map.entry(33, Moves.BODYSLAM),
					Map.entry(41, Moves.ROLLOUT),
					Map.entry(44, Moves.CRUNCH),
					Map.entry(49, Moves.GIGAIMPACT)
			)),
	ARTICUNO ("Articuno", 144, Arrays.asList(Type.FLYING, Type.ICE), Ability.PRESSURE, 90, 85, 100, 95, 125, 85, -1, -1, 215, 3, Growth.SLOW, 3,
			Map.ofEntries(
					Map.entry(8, Moves.MIST),
					Map.entry(15, Moves.ICESHARD),
//					Map.entry(22, Moves.MINDREADER),
					Map.entry(29, Moves.ANCIENTPOWER),
					Map.entry(36, Moves.AGILITY),
					Map.entry(43, Moves.ICEBEAM),
					Map.entry(50, Moves.REFLECT),
					Map.entry(57, Moves.ROOST),
//					Map.entry(64, Moves.TAILWIND),
					Map.entry(71, Moves.BLIZZARD),
					Map.entry(78, Moves.SHEERCOLD),
					Map.entry(85, Moves.HAIL)
			)),
	ZAPDOS ("Zapdos", 145, Arrays.asList(Type.FLYING, Type.ELECTRIC), Ability.PRESSURE, 90, 90, 85, 125, 90, 100, -1, -1, 216, 3, Growth.SLOW, 3,
			Map.ofEntries(
					Map.entry(8, Moves.THUNDERWAVE),
					Map.entry(15, Moves.DETECT),
					Map.entry(22, Moves.PLUCK),
					Map.entry(29, Moves.ANCIENTPOWER),
//					Map.entry(36, Moves.CHARGE),
					Map.entry(43, Moves.AGILITY),
					Map.entry(50, Moves.DISCHARGE),
					Map.entry(57, Moves.ROOST),
					Map.entry(64, Moves.LIGHTSCREEN),
					Map.entry(71, Moves.DRILLPECK),
					Map.entry(78, Moves.THUNDER),
					Map.entry(85, Moves.RAINDANCE)
			)),
	MOLTRES ("Moltres", 146, Arrays.asList(Type.FLYING, Type.FIRE), Ability.PRESSURE, 90, 100, 90, 125, 85, 90, -1, -1, 217, 3, Growth.SLOW, 3,
			Map.ofEntries(
					Map.entry(8, Moves.FIRESPIN),
					Map.entry(15, Moves.AGILITY),
//					Map.entry(22, Moves.ENDURE),
					Map.entry(29, Moves.ANCIENTPOWER),
					Map.entry(36, Moves.FLAMETHROWER),
					Map.entry(43, Moves.SAFEGUARD),
					Map.entry(50, Moves.AIRSLASH),
					Map.entry(57, Moves.ROOST),
					Map.entry(64, Moves.HEATWAVE),
					Map.entry(71, Moves.SOLARBEAM),
					Map.entry(78, Moves.SKYATTACK),
					Map.entry(85, Moves.SUNNYDAY)
			)),
	DRATINI ("Dratini", 147, Type.DRAGON, Ability.SHEDSKIN, 41, 64, 45, 50, 50, 50, 35, 148, 67, 1, Growth.SLOW, 45,
			Map.ofEntries(
					Map.entry(5, Moves.THUNDERWAVE),
					Map.entry(11, Moves.TWISTER),
					Map.entry(15, Moves.DRAGONRAGE),
					Map.entry(21, Moves.SLAM),
					Map.entry(25, Moves.AGILITY),
					Map.entry(31, Moves.AQUATAIL),
					Map.entry(35, Moves.DRAGONRUSH),
					Map.entry(41, Moves.SAFEGUARD),
					Map.entry(45, Moves.DRAGONDANCE),
					Map.entry(51, Moves.OUTRAGE),
					Map.entry(55, Moves.HYPERBEAM)
			)),
	DRAGONAIR ("Dragonair", 148, Type.DRAGON, Ability.SHEDSKIN, 61, 84, 65, 70, 70, 70, 55, 149, 144, 2, Growth.SLOW, 45,
			Map.ofEntries(
					Map.entry(5, Moves.THUNDERWAVE),
					Map.entry(11, Moves.TWISTER),
					Map.entry(15, Moves.DRAGONRAGE),
					Map.entry(21, Moves.SLAM),
					Map.entry(25, Moves.AGILITY),
					Map.entry(33, Moves.AQUATAIL),
					Map.entry(39, Moves.DRAGONRUSH),
					Map.entry(47, Moves.SAFEGUARD),
					Map.entry(53, Moves.DRAGONDANCE),
					Map.entry(61, Moves.OUTRAGE),
					Map.entry(67, Moves.HYPERBEAM)
			)),
	DRAGONITE ("Dragonite", 149, Arrays.asList(Type.DRAGON, Type.FLYING), Ability.INNERFOCUS, 91, 134, 95, 100, 100, 80, -1, -1, 218, 3, Growth.SLOW, 45,
			Map.ofEntries(
					Map.entry(5, Moves.THUNDERWAVE),
					Map.entry(11, Moves.TWISTER),
					Map.entry(15, Moves.DRAGONRAGE),
					Map.entry(21, Moves.SLAM),
					Map.entry(25, Moves.AGILITY),
					Map.entry(33, Moves.AQUATAIL),
					Map.entry(39, Moves.DRAGONRUSH),
					Map.entry(47, Moves.SAFEGUARD),
					Map.entry(53, Moves.DRAGONDANCE),
					Map.entry(55, Moves.WINGATTACK),
					Map.entry(64, Moves.OUTRAGE),
					Map.entry(73, Moves.HYPERBEAM)
			)),
	MEWTWO ("Mewtwo", 150, Type.PSYCHIC, Ability.PRESSURE, 106, 110, 90, 154, 90, 130, -1, -1, 220, 3, Growth.SLOW, 3,
			Map.ofEntries(
					Map.entry(8, Moves.BARRIER),
					Map.entry(15, Moves.SWIFT),
					Map.entry(22, Moves.FUTURESIGHT),
					Map.entry(29, Moves.PSYCHUP),
					Map.entry(36, Moves.MIRACLEEYE),
					Map.entry(43, Moves.MIST),
					Map.entry(50, Moves.PSYCHOCUT),
					Map.entry(57, Moves.AMNESIA),
					Map.entry(71, Moves.PSYCHIC),
					Map.entry(86, Moves.RECOVER),
					Map.entry(93, Moves.SAFEGUARD),
					Map.entry(100, Moves.AURASPHERE)
			)),
	MEW ("Mew", 151, Type.PSYCHIC, Ability.SYNCHRONIZE, 100, 100, 100, 100, 100, 100, -1, -1, 64, 5, Growth.SLOW, 45,
			Map.ofEntries(
					Map.entry(10, Moves.MEGAPUNCH),
					Map.entry(20, Moves.METRONOME),
					Map.entry(30, Moves.PSYCHIC),
					Map.entry(40, Moves.BARRIER),
					Map.entry(50, Moves.ANCIENTPOWER),
					Map.entry(60, Moves.AMNESIA),
					Map.entry(90, Moves.NASTYPLOT),
					Map.entry(100, Moves.AURASPHERE)
			)),
	CHIKORITA ("Chikorita", 152, Type.GRASS, Ability.OVERGROW, 45, 49, 65, 49, 65, 45, 16, 153, 64, 1, Growth.MEDIUMSLOW, 45,
			Map.ofEntries(
					Map.entry(6, Moves.RAZORLEAF),
					Map.entry(9, Moves.POISONPOWDER),
//					Map.entry(12, Moves.SYNTHESIS),
					Map.entry(17, Moves.REFLECT),
					Map.entry(20, Moves.MAGICALLEAF),
//					Map.entry(23, Moves.NATURALGIFT),
					Map.entry(28, Moves.SWEETSCENT),
					Map.entry(31, Moves.LIGHTSCREEN),
					Map.entry(34, Moves.BODYSLAM),
					Map.entry(39, Moves.SAFEGUARD),
//					Map.entry(42, Moves.AROMATHERAPY),
					Map.entry(45, Moves.SOLARBEAM)					
			)),
	BAYLEEF ("Bayleef", 153, Type.GRASS, Ability.OVERGROW, 60, 62, 80, 63, 80, 60, 16, 154, 141, 2, Growth.MEDIUMSLOW, 45,
			Map.ofEntries(
					Map.entry(6, Moves.RAZORLEAF),
					Map.entry(9, Moves.POISONPOWDER),
//					Map.entry(12, Moves.SYNTHESIS),
					Map.entry(18, Moves.REFLECT),
					Map.entry(22, Moves.MAGICALLEAF),
//					Map.entry(26, Moves.NATURALGIFT),
					Map.entry(32, Moves.SWEETSCENT),
					Map.entry(36, Moves.LIGHTSCREEN),
					Map.entry(40, Moves.BODYSLAM),
					Map.entry(46, Moves.SAFEGUARD),
//					Map.entry(50, Moves.AROMATHERAPY),
					Map.entry(54, Moves.SOLARBEAM)					
			)),
	MEGANIUM ("Meganium", 154, Type.GRASS, Ability.OVERGROW, 80, 82, 100, 83, 100, 80, -1, -1, 208, 3, Growth.MEDIUMSLOW, 45,
			Map.ofEntries(
					Map.entry(6, Moves.RAZORLEAF),
					Map.entry(9, Moves.POISONPOWDER),
//					Map.entry(12, Moves.SYNTHESIS),
					Map.entry(18, Moves.REFLECT),
					Map.entry(22, Moves.MAGICALLEAF),
//					Map.entry(26, Moves.NATURALGIFT),
					Map.entry(34, Moves.SWEETSCENT),
					Map.entry(40, Moves.LIGHTSCREEN),
					Map.entry(46, Moves.BODYSLAM),
					Map.entry(54, Moves.SAFEGUARD),
//					Map.entry(60, Moves.AROMATHERAPY),
					Map.entry(66, Moves.SOLARBEAM)					
			)),
	CYNDAQUIL ("Cyndaquil", 155, Type.FIRE, Ability.BLAZE, 39, 52, 43, 60, 50, 65, 14, 156, 65, 1, Growth.MEDIUMSLOW, 45, 
			Map.ofEntries(
					Map.entry(4, Moves.SMOKESCREEN),
					Map.entry(10, Moves.EMBER),
					Map.entry(13, Moves.QUICKATTACK),
					Map.entry(19, Moves.FLAMEWHEEL),
					Map.entry(22, Moves.DEFENSECURL),
					Map.entry(28, Moves.SWIFT),
					Map.entry(31, Moves.LAVAPLUME),
					Map.entry(37, Moves.FLAMETHROWER),
					Map.entry(40, Moves.ROLLOUT),
					Map.entry(46, Moves.DOUBLEEDGE),
					Map.entry(49, Moves.ERUPTION)			
			)),
	QUILAVA ("Quilava", 156, Type.FIRE, Ability.BLAZE, 58, 64, 58, 80, 65, 80, 36, 157, 142, 2, Growth.MEDIUMSLOW, 45, 
			Map.ofEntries(
					Map.entry(4, Moves.SMOKESCREEN),
					Map.entry(10, Moves.EMBER),
					Map.entry(13, Moves.QUICKATTACK),
					Map.entry(20, Moves.FLAMEWHEEL),
					Map.entry(24, Moves.DEFENSECURL),
					Map.entry(31, Moves.SWIFT),
					Map.entry(35, Moves.LAVAPLUME),
					Map.entry(42, Moves.FLAMETHROWER),
					Map.entry(46, Moves.ROLLOUT),
					Map.entry(53, Moves.DOUBLEEDGE),
					Map.entry(57, Moves.ERUPTION)			
			)),
	TYPHLOSION ("Typhlosion", 157, Type.FIRE, Ability.BLAZE, 78, 84, 78, 109, 85, 100, -1, -1, 209, 3, Growth.MEDIUMSLOW, 45, 
			Map.ofEntries(
					Map.entry(4, Moves.SMOKESCREEN),
					Map.entry(10, Moves.EMBER),
					Map.entry(13, Moves.QUICKATTACK),
					Map.entry(20, Moves.FLAMEWHEEL),
					Map.entry(24, Moves.DEFENSECURL),
					Map.entry(31, Moves.SWIFT),
					Map.entry(35, Moves.LAVAPLUME),
					Map.entry(42, Moves.FLAMETHROWER),
					Map.entry(46, Moves.ROLLOUT),
					Map.entry(53, Moves.DOUBLEEDGE),
					Map.entry(57, Moves.ERUPTION)			
			)),
	TOTODILE ("Totodile", 158, Type.WATER, Ability.TORRENT, 50, 65, 64, 44, 48, 43, 18, 159, 66, 1, Growth.MEDIUMSLOW, 45,
			Map.ofEntries(
					Map.entry(6, Moves.WATERGUN),
					Map.entry(8, Moves.RAGE),
					Map.entry(13, Moves.BITE),
					Map.entry(15, Moves.SCARYFACE),
					Map.entry(20, Moves.ICEFANG),
					Map.entry(22, Moves.THRASH),
					Map.entry(27, Moves.CRUNCH),
					Map.entry(29, Moves.SLASH),
					Map.entry(34, Moves.SCREECH),
					Map.entry(36, Moves.AQUATAIL),
//					Map.entry(41, Moves.SUPERPOWER),
					Map.entry(43, Moves.HYDROPUMP)
			)),
	CROCONAW ("Croconaw", 159, Type.WATER, Ability.TORRENT, 65, 80, 80, 59, 63, 58, 35, 159, 143, 2, Growth.MEDIUMSLOW, 45,
			Map.ofEntries(
					Map.entry(6, Moves.WATERGUN),
					Map.entry(8, Moves.RAGE),
					Map.entry(13, Moves.BITE),
					Map.entry(15, Moves.SCARYFACE),
					Map.entry(21, Moves.ICEFANG),
					Map.entry(24, Moves.THRASH),
					Map.entry(30, Moves.CRUNCH),
					Map.entry(33, Moves.SLASH),
					Map.entry(39, Moves.SCREECH),
					Map.entry(42, Moves.AQUATAIL),
//					Map.entry(48, Moves.SUPERPOWER),
					Map.entry(51, Moves.HYDROPUMP)
			)),
	FERALIGATR ("Feraligatr", 160, Type.WATER, Ability.TORRENT, 85, 105, 100, 79, 83, 78, -1, -1, 210, 3, Growth.MEDIUMSLOW, 45,
			Map.ofEntries(
					Map.entry(6, Moves.WATERGUN),
					Map.entry(8, Moves.RAGE),
					Map.entry(13, Moves.BITE),
					Map.entry(15, Moves.SCARYFACE),
					Map.entry(21, Moves.ICEFANG),
					Map.entry(24, Moves.THRASH),
					Map.entry(30, Moves.AGILITY),
					Map.entry(32, Moves.CRUNCH),
					Map.entry(37, Moves.SLASH),
					Map.entry(45, Moves.SCREECH),
					Map.entry(50, Moves.AQUATAIL),
//					Map.entry(58, Moves.SUPERPOWER),
					Map.entry(63, Moves.HYDROPUMP)
			)),
	CROBAT ("Crobat", 169, Arrays.asList(Type.POISON, Type.FLYING), Ability.INNERFOCUS, 85, 90, 80, 70, 80, 130, -1, -1, 204, 3, Growth.MEDIUMFAST, 90,
			Map.ofEntries(
					Map.entry(5, Moves.SUPERSONIC),
					Map.entry(9, Moves.ASTONISH),
					Map.entry(13, Moves.BITE),
					Map.entry(17, Moves.WINGATTACK),
					Map.entry(21, Moves.CONFUSERAY),
					Map.entry(27, Moves.AIRCUTTER),
//					Map.entry(33, Moves.MEANLOOK),
					Map.entry(39, Moves.POISONFANG),
					Map.entry(45, Moves.HAZE),
					Map.entry(51, Moves.AIRSLASH)
			)),
	KINGDRA ("Kingdra", 230, Arrays.asList(Type.WATER, Type.DRAGON), Ability.SNIPER, 75, 95, 95, 95, 95, 85, -1, -1, 207, 3, Growth.MEDIUMFAST, 45,
			Map.ofEntries(
					Map.entry(4, Moves.SMOKESCREEN),
					Map.entry(8, Moves.LEER),
					Map.entry(11, Moves.WATERGUN),
					Map.entry(18, Moves.BUBBLEBEAM),
					Map.entry(23, Moves.AGILITY),
					Map.entry(26, Moves.TWISTER),
					Map.entry(30, Moves.BRINE),
					Map.entry(40, Moves.HYDROPUMP),
					Map.entry(48, Moves.DRAGONDANCE),
					Map.entry(57, Moves.DRAGONPULSE)
			)),
	RAIKOU ("Raikou", 243, Type.ELECTRIC, Ability.PRESSURE, 90, 85, 75, 115, 100, 115, -1, -1, 216, 3, Growth.SLOW, 3,
			Map.ofEntries(
					Map.entry(8, Moves.THUNDERSHOCK),
					Map.entry(22, Moves.QUICKATTACK),
					Map.entry(29, Moves.SPARK),
					Map.entry(36, Moves.REFLECT),
					Map.entry(43, Moves.CRUNCH),
					Map.entry(50, Moves.THUNDERFANG),
					Map.entry(57, Moves.DISCHARGE),
					Map.entry(64, Moves.EXTRASENSORY),
					Map.entry(71, Moves.THUNDER),
					Map.entry(78, Moves.CALMMIND)
			)),
	ENTEI ("Entei", 244, Type.FIRE, Ability.PRESSURE, 115, 115, 85, 90, 75, 100, -1, -1, 217, 3, Growth.SLOW, 3,
			Map.ofEntries(
					Map.entry(8, Moves.EMBER),
					Map.entry(22, Moves.FIRESPIN),
					Map.entry(29, Moves.STOMP),
					Map.entry(36, Moves.FLAMETHROWER),
					Map.entry(43, Moves.SWAGGER),
					Map.entry(50, Moves.FIREFANG),
					Map.entry(57, Moves.LAVAPLUME),
					Map.entry(64, Moves.EXTRASENSORY),
					Map.entry(71, Moves.FIREBLAST),
					Map.entry(78, Moves.CALMMIND)
			)),
	SUICUNE ("Suicune", 245, Type.WATER, Ability.PRESSURE, 100, 75, 115, 90, 115, 85, -1, -1, 215, 3, Growth.SLOW, 3,
			Map.ofEntries(
					Map.entry(8, Moves.BUBBLEBEAM),
					Map.entry(15, Moves.RAINDANCE),
					Map.entry(22, Moves.GUST),
					Map.entry(29, Moves.AURORABEAM),
					Map.entry(50, Moves.ICEFANG),
					Map.entry(64, Moves.EXTRASENSORY),
					Map.entry(71, Moves.HYDROPUMP),
					Map.entry(78, Moves.CALMMIND)
			)),
	LUGIA ("Lugia", 249, Type.FIRE, Ability.PRESSURE, 106, 90, 130, 90, 154, 110, -1, -1, 220, 3, Growth.SLOW, 3,
			Map.ofEntries(
					Map.entry(9, Moves.SAFEGUARD),
					Map.entry(15, Moves.GUST),
					Map.entry(23, Moves.RECOVER),
					Map.entry(29, Moves.HYDROPUMP),
					Map.entry(37, Moves.RAINDANCE),
					Map.entry(43, Moves.SWIFT),
//					Map.entry(51, Moves.NAUTRALGIFT),
					Map.entry(57, Moves.ANCIENTPOWER),
					Map.entry(65, Moves.EXTRASENSORY),
					Map.entry(71, Moves.PUNISHMENT),
					Map.entry(79, Moves.FUTURESIGHT),
					Map.entry(85, Moves.AEROBLAST),
					Map.entry(93, Moves.CALMMIND),
					Map.entry(99, Moves.SKYATTACK)
			)),
	HOOH ("Ho-Oh", 250, Type.FIRE, Ability.PRESSURE, 106, 130, 90, 110, 154, 90, -1, -1, 220, 3, Growth.SLOW, 3,
			Map.ofEntries(
					Map.entry(9, Moves.SAFEGUARD),
					Map.entry(15, Moves.GUST),
					Map.entry(23, Moves.RECOVER),
					Map.entry(29, Moves.FIREBLAST),
					Map.entry(37, Moves.SUNNYDAY),
					Map.entry(43, Moves.SWIFT),
//					Map.entry(51, Moves.NAUTRALGIFT),
					Map.entry(57, Moves.ANCIENTPOWER),
					Map.entry(65, Moves.EXTRASENSORY),
					Map.entry(71, Moves.PUNISHMENT),
					Map.entry(79, Moves.FUTURESIGHT),
					Map.entry(85, Moves.SACREDFIRE),
					Map.entry(93, Moves.CALMMIND),
					Map.entry(99, Moves.SKYATTACK)
			)),
	CELEBI ("Celebi", 251, Type.FIRE, Ability.NATURALCURE, 100, 100, 100, 100, 100, 100, -1, -1, 64, 3, Growth.MEDIUMSLOW, 45,
			Map.ofEntries(
					Map.entry(10, Moves.SAFEGUARD),
					Map.entry(19, Moves.MAGICALLEAF),
					Map.entry(28, Moves.ANCIENTPOWER),
//					Map.entry(37, Moves.BATONPASS),
//					Map.entry(46, Moves.NATURALGIFT),
//					Map.entry(55, Moves.HEALBLOCK),
					Map.entry(64, Moves.FUTURESIGHT),
//					Map.entry(73, Moves.HEALINGWISH),
					Map.entry(82, Moves.LEAFSTORM),
					Map.entry(91, Moves.PERISHSONG)
			)),
	TREECKO ("Treecko", 252, Type.GRASS, Ability.OVERGROW, 40, 45, 35, 65, 55, 70, 16, 253, 65, 1, Growth.MEDIUMSLOW, 45, 
			Map.ofEntries(
					Map.entry(6, Moves.ABSORB),
					Map.entry(11, Moves.QUICKATTACK),
					Map.entry(16, Moves.PURSUIT),
					Map.entry(21, Moves.SCREECH),
					Map.entry(26, Moves.MEGADRAIN),
					Map.entry(31, Moves.AGILITY),
					Map.entry(36, Moves.SLAM),
					Map.entry(46, Moves.GIGADRAIN),
					Map.entry(51, Moves.ENERGYBALL)
			)),
	GROVYLE ("Grovyle", 253, Type.GRASS, Ability.OVERGROW, 50, 65, 45, 85, 65, 95, 36, 254, 141, 2, Growth.MEDIUMSLOW, 45, 
			Map.ofEntries(
					Map.entry(6, Moves.ABSORB),
					Map.entry(11, Moves.QUICKATTACK),
					Map.entry(16, Moves.FURYCUTTER),
					Map.entry(17, Moves.PURSUIT),
					Map.entry(23, Moves.SCREECH),
					Map.entry(29, Moves.LEAFBLADE),
					Map.entry(35, Moves.AGILITY),
					Map.entry(41, Moves.SLAM),
					Map.entry(53, Moves.FALSESWIPE),
					Map.entry(59, Moves.LEAFSTORM)
			)),
	SCEPTILE ("Sceptile", 254, Type.GRASS, Ability.OVERGROW, 70, 85, 65, 105, 85, 120, -1, -1, 208, 3, Growth.MEDIUMSLOW, 45,
			Map.ofEntries(
					Map.entry(6, Moves.ABSORB),
					Map.entry(11, Moves.QUICKATTACK),
					Map.entry(16, Moves.FURYCUTTER),
					Map.entry(17, Moves.PURSUIT),
					Map.entry(23, Moves.SCREECH),
					Map.entry(29, Moves.LEAFBLADE),
					Map.entry(35, Moves.AGILITY),
					Map.entry(43, Moves.SLAM),
					Map.entry(59, Moves.FALSESWIPE),
					Map.entry(67, Moves.LEAFSTORM)
			)),
	TORCHIC ("Torchic", 255, Type.FIRE, Ability.BLAZE, 45, 60, 40, 70, 50, 45, 16, 256, 65, 1, Growth.MEDIUMSLOW, 45,
			Map.ofEntries(
					Map.entry(10, Moves.EMBER),
					Map.entry(16, Moves.PECK),
					Map.entry(19, Moves.SANDATTACK),
					Map.entry(25, Moves.FIRESPIN),
					Map.entry(28, Moves.QUICKATTACK),
					Map.entry(34, Moves.SLASH),
					Map.entry(43, Moves.FLAMETHROWER)
			)),
	COMBUSKEN ("Combusken", 256, Arrays.asList(Type.FIRE, Type.FIGHTING), Ability.BLAZE, 60, 85, 60, 85, 60, 55, 36, 257, 142, 2, Growth.MEDIUMSLOW, 45,
			Map.ofEntries(
					Map.entry(13, Moves.EMBER),
					Map.entry(16, Moves.DOUBLEKICK),
					Map.entry(17, Moves.PECK),
					Map.entry(21, Moves.SANDATTACK),
					Map.entry(28, Moves.BULKUP),
					Map.entry(32, Moves.QUICKATTACK),
					Map.entry(39, Moves.SLASH),
					Map.entry(50, Moves.SKYUPPERCUT),
					Map.entry(54, Moves.FLAREBLITZ)
			)),
	BLAZIKEN ("Blaziken", 257, Arrays.asList(Type.FIRE, Type.FIGHTING), Ability.BLAZE, 80, 120, 70, 110, 70, 80, -1, -1, 209, 3, Growth.MEDIUMSLOW, 45, 
			Map.ofEntries(
					Map.entry(13, Moves.EMBER),
					Map.entry(16, Moves.DOUBLEKICK),
					Map.entry(17, Moves.PECK),
					Map.entry(21, Moves.SANDATTACK),
					Map.entry(28, Moves.BULKUP),
					Map.entry(32, Moves.QUICKATTACK),
					Map.entry(36, Moves.BLAZEKICK),
					Map.entry(42, Moves.SLASH),
					Map.entry(49, Moves.BRAVEBIRD),
					Map.entry(59, Moves.SKYUPPERCUT),
					Map.entry(66, Moves.FLAREBLITZ)
			)),
	MUDKIP ("Mudkip", 258, Type.WATER, Ability.TORRENT, 50, 70, 50, 50, 50, 40, 16, 259, 65, 1, Growth.MEDIUMSLOW, 45, 
			Map.ofEntries(
					Map.entry(6, Moves.MUDSLAP),
					Map.entry(10, Moves.WATERGUN),
					Map.entry(28, Moves.TAKEDOWN),
					Map.entry(37, Moves.PROTECT),
					Map.entry(42, Moves.HYDROPUMP),
					Map.entry(46, Moves.ENDEAVOR)
			)),
	MARSHTOMP ("Marshtomp", 259, Arrays.asList(Type.WATER, Type.GROUND), Ability.TORRENT, 70, 85, 70, 60, 70, 50, 36, 260, 143, 2, Growth.MEDIUMSLOW, 45,
			Map.ofEntries(
					Map.entry(6, Moves.MUDSLAP),
					Map.entry(10, Moves.WATERGUN),
					Map.entry(16, Moves.MUDSHOT),
					Map.entry(25, Moves.MUDBOMB),
					Map.entry(31, Moves.TAKEDOWN),					
					Map.entry(37, Moves.MUDDYWATER),
					Map.entry(42, Moves.PROTECT),
					Map.entry(46, Moves.EARTHQUAKE),
					Map.entry(53, Moves.ENDEAVOR)
			)),	
	SWAMPERT ("Swampert", 260, Arrays.asList(Type.WATER, Type.GROUND), Ability.TORRENT, 100, 110, 90, 85, 90, 60, -1, -1, 210, 3, Growth.MEDIUMSLOW, 45,
			Map.ofEntries(
					Map.entry(6, Moves.MUDSLAP),
					Map.entry(10, Moves.WATERGUN),
					Map.entry(16, Moves.MUDSHOT),
					Map.entry(25, Moves.MUDBOMB),
					Map.entry(31, Moves.TAKEDOWN),					
					Map.entry(39, Moves.MUDDYWATER),
					Map.entry(46, Moves.PROTECT),
					Map.entry(52, Moves.EARTHQUAKE),
					Map.entry(61, Moves.ENDEAVOR),
					Map.entry(69, Moves.HAMMERARM)
			)),
	POOCHYENA ("Poochyena", 261, Type.DARK, Ability.QUICKFEET, 35, 55, 35, 30, 30, 35, 18, 262, 55, 1, Growth.MEDIUMFAST, 255, 
			Map.ofEntries(
					Map.entry(5, Moves.HOWL),
					Map.entry(9, Moves.SANDATTACK),
					Map.entry(13, Moves.BITE),
					Map.entry(25, Moves.SWAGGER),
//					Map.entry(29, Moves.ASSURANCE),
					Map.entry(33, Moves.SCARYFACE),
					Map.entry(45, Moves.TAKEDOWN),
					Map.entry(49, Moves.SUCKERPUNCH),
					Map.entry(53, Moves.CRUNCH)
			)),
	MIGHTYENA ("Mightyena", 262, Type.DARK, Ability.QUICKFEET, 70, 90, 70, 60, 60, 70, -1, -1, 128, 2, Growth.MEDIUMFAST, 127, 
			Map.ofEntries(
					Map.entry(5, Moves.HOWL),
					Map.entry(9, Moves.SANDATTACK),
					Map.entry(13, Moves.BITE),
					Map.entry(27, Moves.SWAGGER),
//					Map.entry(32, Moves.ASSURANCE),
					Map.entry(37, Moves.SCARYFACE),
					Map.entry(52, Moves.TAKEDOWN),
					Map.entry(62, Moves.SUCKERPUNCH)
			)),
	ZIGZAGOON ("Zigzagoon", 264, Type.NORMAL, Ability.QUICKFEET, 38, 30, 41, 30, 41, 60, 25, 265, 60, 1, Growth.MEDIUMFAST, 255, 
			Map.ofEntries(	
					Map.entry(5, Moves.TAILWHIP), 
					Map.entry(9, Moves.HEADBUTT),
					Map.entry(13, Moves.SANDATTACK),
					Map.entry(33, Moves.FLAIL),
					Map.entry(37, Moves.REST)
//					Map.entry(45, Moves.FLING)
			)),	
	LINOONE ("Linoone", 265, Type.NORMAL, Ability.QUICKFEET, 78, 70, 61, 50, 61, 100, -1, -1, 128, 2, Growth.MEDIUMFAST, 264, 
			Map.ofEntries(	
					Map.entry(5, Moves.TAILWHIP), 
					Map.entry(9, Moves.HEADBUTT),
					Map.entry(13, Moves.SANDATTACK),
					Map.entry(41, Moves.SLASH),
					Map.entry(47, Moves.REST)
//					Map.entry(59, Moves.FLING)
			)),	
	RALTS ("Ralts", 280, Type.PSYCHIC, Ability.SYNCHRONIZE, 28, 25, 25, 45, 45, 40, 20, 281, 70, 1, Growth.SLOW, 235,
			Map.ofEntries(
					Map.entry(6, Moves.CONFUSION),
					Map.entry(10, Moves.DOUBLETEAM),
					Map.entry(12, Moves.TELEPORT),
//					Map.entry(17, Moves.LUCKYCHANT),
					Map.entry(21, Moves.MAGICALLEAF),
					Map.entry(23, Moves.CALMMIND),
					Map.entry(28, Moves.PSYCHIC),
//					Map.entry(32, Moves.IMPRISON),
					Map.entry(34, Moves.FUTURESIGHT),
					Map.entry(39, Moves.CHARM),
					Map.entry(43, Moves.HYPNOSIS),
					Map.entry(45, Moves.DREAMEATER)
			)),
	KIRLIA ("Kirlia", 281, Type.PSYCHIC, Ability.SYNCHRONIZE, 38, 35, 35, 65, 55, 50, 40, 35, 282, 2, Growth.SLOW, 120,
			Map.ofEntries(
					Map.entry(6, Moves.CONFUSION),
					Map.entry(10, Moves.DOUBLETEAM),
					Map.entry(12, Moves.TELEPORT),
//					Map.entry(17, Moves.LUCKYCHANT),
					Map.entry(22, Moves.MAGICALLEAF),
					Map.entry(25, Moves.CALMMIND),
					Map.entry(31, Moves.PSYCHIC),
//					Map.entry(36, Moves.IMPRISON),
					Map.entry(39, Moves.FUTURESIGHT),
					Map.entry(45, Moves.CHARM),
					Map.entry(50, Moves.HYPNOSIS),
					Map.entry(53, Moves.DREAMEATER)
			)),
	GARDEVOIR ("Gardevoir", 282, Type.PSYCHIC, Ability.SYNCHRONIZE, 68, 65, 65, 125, 115, 80, 208, -1, -1, 3, Growth.SLOW, 45,
			Map.ofEntries(
					Map.entry(6, Moves.CONFUSION),
					Map.entry(10, Moves.DOUBLETEAM),
					Map.entry(12, Moves.TELEPORT),
//					Map.entry(17, Moves.LUCKYCHANT),
					Map.entry(22, Moves.MAGICALLEAF),
					Map.entry(25, Moves.CALMMIND),
					Map.entry(33, Moves.PSYCHIC),
//					Map.entry(40, Moves.IMPRISON),
					Map.entry(45, Moves.FUTURESIGHT),
					Map.entry(53, Moves.CAPTIVATE),
					Map.entry(60, Moves.HYPNOSIS),
					Map.entry(65, Moves.DREAMEATER)
			)),
	NINCADA ("Nincada", 290, Arrays.asList(Type.BUG, Type.GROUND), Ability.COMPOUNDEYES, 31, 45, 90, 30, 30, 40, 20, 291, 65, 1, Growth.ERATIC, 255,
			Map.ofEntries(
					Map.entry(5, Moves.LEECHLIFE),
					Map.entry(9, Moves.SANDATTACK),
					Map.entry(14, Moves.FURYSWIPES),
//					Map.entry(19, Moves.MINDREADER),
					Map.entry(25, Moves.FALSESWIPE),
					Map.entry(31, Moves.MUDSLAP),
					Map.entry(38, Moves.METALCLAW),
					Map.entry(45, Moves.DIG)
			)),
	NINJASK ("Ninjask", 291, Arrays.asList(Type.BUG, Type.FLYING), Ability.SPEEDBOOST, 61, 90, 45, 50, 50, 160, 35, 292, 155, 2, Growth.ERATIC, 120,
			Map.ofEntries(
					Map.entry(5, Moves.LEECHLIFE),
					Map.entry(9, Moves.SANDATTACK),
					Map.entry(14, Moves.FURYSWIPES),
//					Map.entry(19, Moves.MINDREADER),
					Map.entry(20, Moves.DOUBLETEAM),
					Map.entry(21, Moves.FURYCUTTER),
					Map.entry(22, Moves.SCREECH),
					Map.entry(25, Moves.SWORDSDANCE),
					Map.entry(31, Moves.SLASH),
					Map.entry(38, Moves.AGILITY),
//					Map.entry(45, Moves.BATONPASS),
					Map.entry(52, Moves.XSCISSOR)
			)),
	SHEDINJA ("Shedinja", 292, Arrays.asList(Type.BUG, Type.GHOST), Ability.WONDERGUARD, 1, 90, 45, 30, 30, 40, -1, -1, 95, 2, Growth.ERATIC, 45,
			Map.ofEntries(
					Map.entry(5, Moves.LEECHLIFE),
					Map.entry(9, Moves.SANDATTACK),
					Map.entry(14, Moves.FURYSWIPES),
//					Map.entry(19, Moves.MINDREADER),
					Map.entry(25, Moves.SPITE),
					Map.entry(31, Moves.CONFUSERAY),
					Map.entry(38, Moves.SHADOWSNEAK),
//					Map.entry(45, Moves.GRUDGE),
//					Map.entry(52, Moves.HEALBLOCK),
					Map.entry(59, Moves.SHADOWBALL)
			)),
	WHISMUR ("Whismur", 293, Type.NORMAL, Ability.SOUNDPROOF, 64, 51, 23, 51, 23, 28, 20, 294, 68, 1, Growth.MEDIUMSLOW, 190,
			Map.ofEntries(
					Map.entry(11, Moves.ASTONISH),
					Map.entry(15, Moves.HOWL),
					Map.entry(21, Moves.SUPERSONIC),
					Map.entry(25, Moves.STOMP),
					Map.entry(31, Moves.SCREECH),
					Map.entry(41, Moves.REST),
					Map.entry(42, Moves.SLEEPTALK),
					Map.entry(45, Moves.HYPERVOICE)
			)),
	LOUDRED ("Loudred", 294, Type.NORMAL, Ability.SOUNDPROOF, 84, 71, 43, 71, 43, 48, 40, 295, 126, 2, Growth.MEDIUMSLOW, 120,
			Map.ofEntries(
					Map.entry(11, Moves.ASTONISH),
					Map.entry(15, Moves.HOWL),
					Map.entry(20, Moves.BITE),
					Map.entry(23, Moves.SUPERSONIC),
					Map.entry(29, Moves.STOMP),
					Map.entry(37, Moves.SCREECH),
					Map.entry(51, Moves.REST),
					Map.entry(52, Moves.SLEEPTALK),
					Map.entry(57, Moves.HYPERVOICE)
			)),
	EXPLOUD ("Exploud", 295, Type.NORMAL, Ability.SOUNDPROOF, 104, 91, 63, 91, 63, 68, -1, -1, 184, 3, Growth.MEDIUMSLOW, 45,
			Map.ofEntries(
					Map.entry(11, Moves.ASTONISH),
					Map.entry(15, Moves.HOWL),
					Map.entry(20, Moves.BITE),
					Map.entry(23, Moves.SUPERSONIC),
					Map.entry(29, Moves.STOMP),
					Map.entry(37, Moves.SCREECH),
					Map.entry(40, Moves.CRUNCH),
					Map.entry(55, Moves.REST),
					Map.entry(56, Moves.SLEEPTALK),
					Map.entry(63, Moves.HYPERVOICE),
					Map.entry(71, Moves.HYPERBEAM)
			)),
	SPHEAL("Spheal", 363, Arrays.asList(Type.ICE, Type.WATER), Ability.THICKFAT, 70, 40, 50, 55, 50, 25, 32, 364, 75, 1, Growth.MEDIUMSLOW, 255,
			Map.ofEntries(
					Map.entry(19, Moves.BODYSLAM),
					Map.entry(25, Moves.AURORABEAM),
					Map.entry(31, Moves.HAIL),
					Map.entry(37, Moves.REST),
					Map.entry(38, Moves.SNORE),
					Map.entry(43, Moves.BLIZZARD),
					Map.entry(49, Moves.SHEERCOLD)
			)),
	SEALEO("Sealeo", 364, Arrays.asList(Type.ICE, Type.WATER), Ability.THICKFAT, 90, 60, 70, 75, 70, 45, 44, 365, 128, 2, Growth.MEDIUMSLOW, 120, 
			Map.ofEntries(
					Map.entry(19, Moves.BODYSLAM),
					Map.entry(25, Moves.AURORABEAM),
					Map.entry(31, Moves.HAIL),
					Map.entry(32, Moves.SWAGGER),
					Map.entry(39, Moves.REST),
					Map.entry(40, Moves.SNORE),
					Map.entry(47, Moves.BLIZZARD),
					Map.entry(55, Moves.SHEERCOLD)
			)),
	WALREIN("Walrein", 365, Arrays.asList(Type.ICE, Type.WATER), Ability.THICKFAT, 110, 80, 90, 95, 90, 65, -1, -1, 192, 3, Growth.MEDIUMSLOW, 45, 
			Map.ofEntries(
					Map.entry(19, Moves.BODYSLAM),
					Map.entry(25, Moves.AURORABEAM),
					Map.entry(31, Moves.HAIL),
					Map.entry(32, Moves.SWAGGER),
					Map.entry(39, Moves.REST),
					Map.entry(40, Moves.SNORE),
					Map.entry(44, Moves.ICEFANG),
					Map.entry(52, Moves.BLIZZARD),
					Map.entry(65, Moves.SHEERCOLD)
			)),
	BAGON("Bagon", 371, Type.DRAGON, Ability.ROCKHEAD, 45, 75, 60, 40, 30, 50, 35, 372, 89, 1, Growth.SLOW, 45, 
			Map.ofEntries(
					Map.entry(5, Moves.BITE),
					Map.entry(10, Moves.LEER),
					Map.entry(16, Moves.HEADBUTT),
//					Map.entry(20, Moves.FOCUSENERGY),
					Map.entry(25, Moves.EMBER),
					Map.entry(31, Moves.DRAGONBREATH),
					Map.entry(35, Moves.ZENHEADBUTT),
					Map.entry(40, Moves.SCARYFACE),
					Map.entry(46, Moves.CRUNCH),
					Map.entry(50, Moves.DRAGONCLAW),
					Map.entry(55, Moves.DOUBLEEDGE)
			)),
	SHELGON("Shelgon", 372, Type.DRAGON, Ability.ROCKHEAD, 65, 95, 100, 60, 50, 50, 50, 373, 144, 2, Growth.SLOW, 45, 
			Map.ofEntries(
					Map.entry(5, Moves.BITE),
					Map.entry(10, Moves.LEER),
					Map.entry(16, Moves.HEADBUTT),
//					Map.entry(20, Moves.FOCUSENERGY),
					Map.entry(25, Moves.EMBER),
					Map.entry(30, Moves.PROTECT),
					Map.entry(32, Moves.DRAGONBREATH),
					Map.entry(37, Moves.ZENHEADBUTT),
					Map.entry(43, Moves.SCARYFACE),
					Map.entry(50, Moves.CRUNCH),
					Map.entry(55, Moves.DRAGONCLAW),
					Map.entry(61, Moves.DOUBLEEDGE)
			)),
	SALAMENCE("Salamence", 373, Arrays.asList(Type.DRAGON, Type.FLYING), Ability.INTIMIDATE, 95, 135, 80, 110, 80, 100, -1, -1, 218, 3, Growth.SLOW, 45, 
			Map.ofEntries(
					Map.entry(5, Moves.BITE),
					Map.entry(10, Moves.LEER),
					Map.entry(16, Moves.HEADBUTT),
//					Map.entry(20, Moves.FOCUSENERGY),
					Map.entry(25, Moves.EMBER),
					Map.entry(30, Moves.PROTECT),
					Map.entry(32, Moves.DRAGONBREATH),
					Map.entry(37, Moves.ZENHEADBUTT),
					Map.entry(43, Moves.SCARYFACE),
					Map.entry(50, Moves.FLY),
					Map.entry(53, Moves.CRUNCH),
					Map.entry(61, Moves.DRAGONCLAW),
					Map.entry(70, Moves.DOUBLEEDGE)
			)),
	BELDUM("Beldum", 374, Arrays.asList(Type.STEEL, Type.PSYCHIC), Ability.CLEARBODY, 40, 55, 80, 35, 60, 30, 25, 375, 103, 1, Growth.SLOW, 3, null),
	METANG("Metang", 375, Arrays.asList(Type.STEEL, Type.PSYCHIC), Ability.CLEARBODY, 60, 75, 100, 55, 80, 50, 45, 376, 153, 2, Growth.SLOW, 3, 
			Map.ofEntries(
					Map.entry(20, Moves.METALCLAW),
					Map.entry(21, Moves.CONFUSION),
					Map.entry(24, Moves.SCARYFACE),
					Map.entry(28, Moves.PURSUIT),
					Map.entry(32, Moves.BULLETPUNCH),
					Map.entry(36, Moves.PSYCHIC),
					Map.entry(40, Moves.IRONDEFENSE),
					Map.entry(44, Moves.AGILITY),
					Map.entry(48, Moves.METEORMASH),
					Map.entry(52, Moves.ZENHEADBUTT),
					Map.entry(56, Moves.HYPERBEAM)
			)),
	METAGROSS("Metagross", 376, Arrays.asList(Type.STEEL, Type.PSYCHIC), Ability.CLEARBODY, 80, 135, 130, 95, 90, 70, -1, -1, 210, 3, Growth.SLOW, 3, 
			Map.ofEntries(
					Map.entry(20, Moves.METALCLAW),
					Map.entry(21, Moves.CONFUSION),
					Map.entry(24, Moves.SCARYFACE),
					Map.entry(28, Moves.PURSUIT),
					Map.entry(32, Moves.BULLETPUNCH),
					Map.entry(36, Moves.PSYCHIC),
					Map.entry(40, Moves.IRONDEFENSE),
					Map.entry(44, Moves.AGILITY),
					Map.entry(45, Moves.HAMMERARM),
					Map.entry(53, Moves.METEORMASH),
					Map.entry(62, Moves.ZENHEADBUTT),
					Map.entry(71, Moves.HYPERBEAM)
			)),
	KYOGRE ("Kyogre", 382, Type.WATER, Ability.DRIZZLE, 100, 100, 90, 150, 140, 90, -1, -1, 218, 3, Growth.SLOW, 3,
			Map.ofEntries(
					Map.entry(5, Moves.SCARYFACE),
					Map.entry(15, Moves.ANCIENTPOWER),
					Map.entry(20, Moves.BODYSLAM),
					Map.entry(30, Moves.CALMMIND),
					Map.entry(35, Moves.ICEBEAM),
					Map.entry(45, Moves.HYDROPUMP),
					Map.entry(50, Moves.REST),
					Map.entry(60, Moves.SHEERCOLD),
					Map.entry(65, Moves.DOUBLEEDGE),
					Map.entry(75, Moves.AQUATAIL),
					Map.entry(80, Moves.WATERSPOUT)
			)), 
	GROUDON ("Groudon", 383, Type.GROUND, Ability.DROUGHT, 100, 150, 140, 100, 90, 90, -1, -1, 218, 3, Growth.SLOW, 3,
			Map.ofEntries(
					Map.entry(5, Moves.SCARYFACE),
					Map.entry(15, Moves.ANCIENTPOWER),
					Map.entry(20, Moves.SLASH),
					Map.entry(30, Moves.BULKUP),
					Map.entry(35, Moves.EARTHQUAKE),
					Map.entry(45, Moves.FIREBLAST),
					Map.entry(50, Moves.REST),
					Map.entry(60, Moves.FISSURE),
					Map.entry(65, Moves.SOLARBEAM),
					Map.entry(75, Moves.EARTHPOWER),
					Map.entry(80, Moves.ERUPTION)
			)),
	RAYQUAZA ("Rayquaza", 384, Arrays.asList(Type.DRAGON, Type.FLYING), Ability.AIRLOCK, 105, 150, 90, 150, 90, 95, -1, -1, 220, 3, Growth.SLOW, 3,
			Map.ofEntries(
					Map.entry(5, Moves.SCARYFACE),
					Map.entry(15, Moves.ANCIENTPOWER),
					Map.entry(20, Moves.DRAGONCLAW),
					Map.entry(30, Moves.DRAGONDANCE),
					Map.entry(35, Moves.CRUNCH),
					Map.entry(45, Moves.FLY),
					Map.entry(50, Moves.REST),
					Map.entry(60, Moves.EXTREMESPEED),
					Map.entry(65, Moves.HYPERBEAM),
					Map.entry(75, Moves.DRAGONPULSE),
					Map.entry(80, Moves.OUTRAGE)
			)),
	JIRACHI ("Jirachi", 385, Arrays.asList(Type.STEEL, Type.PSYCHIC), Ability.SERENEGRACE, 100, 100, 100, 100, 100, 100, -1, -1, 215, 3, Growth.SLOW, 3,
			Map.ofEntries(
					Map.entry(5, Moves.REST),
					Map.entry(10, Moves.SWIFT),
					Map.entry(20, Moves.PSYCHIC),
					Map.entry(25, Moves.REFRESH),
					Map.entry(30, Moves.REST),
					Map.entry(35, Moves.ZENHEADBUTT),
					Map.entry(40, Moves.DOUBLEEDGE),
//					Map.entry(45, Moves.GRAVITY),
//					Map.entry(50, Moves.HEALINGWISH),
					Map.entry(55, Moves.FUTURESIGHT),
					Map.entry(60, Moves.COSMICPOWER)
//					Map.entry(65, Moves.LASTRESORT),
//					Map.entry(70, Moves.DOOMDESIRE)
			)),
	DEOXYS ("Deoxys", 386, Type.PSYCHIC, Ability.PRESSURE, 50, 150, 50, 150,50, 150, -1, -1, 215, 3, Growth.SLOW, 3,
			Map.ofEntries(
					Map.entry(9, Moves.NIGHTSHADE),
					Map.entry(17, Moves.TELEPORT),
					Map.entry(25, Moves.KNOCKOFF),
					Map.entry(33, Moves.PURSUIT),
					Map.entry(41, Moves.PSYCHIC),
//					Map.entry(49, Moves.SNATCH),
					Map.entry(57, Moves.PSYCHOSHIFT),
					Map.entry(65, Moves.ZENHEADBUTT),
					Map.entry(73, Moves.COSMICPOWER),
					Map.entry(81, Moves.RECOVER),
					Map.entry(89, Moves.PSYCHOBOOST),
					Map.entry(97, Moves.HYPERBEAM)
			));
	/** END INITIALIZE ENUMS **/
				
	/** INITIALIZE VALUES**/
	
	private final BufferedImage frontSprite, backSprite, menuSprite;
	private final String name;
	private final int index;
	private final Type type;
	private final Ability ability;
	private final List<Type> types;
	private int hp, attack, defense, spAttack, spDefense, speed, evolveLevel, evolveIndex, expYield, ev, catchRate;
	private Growth growth;
	private Map<Integer, Moves> moveLevels;
	/** END INITIALIZE VALUES **/
		
	/** CONSTRUCTORS **/	
	Pokedex(String name, int index, Type type, Ability ability, 
			int hp, int attack, int defense, int spAttack, int spDefense, int speed,
			int evolveLevel, int evolveIndex, int expYield, int ev, Growth growth, int catchRate, 
			Map<Integer, Moves> moveLevels) {	
		
		this.frontSprite = setup("/pokedex/front/" + name, 48 * 5, 48 * 5); 
		this.backSprite = setup("/pokedex/back/" + name, 48 * 5, 48 * 5);
		this.menuSprite = setup("/pokedex/menu/" + name, 48 * 2, 48 * 2);
		
		this.name = name; 
		this.index = index; 
		this.type = type; 
		this.types = null;	
		this.ability = ability;
		
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
		this.spAttack = spAttack;
		this.spDefense = spDefense;
		this.speed = speed;
		
		this.evolveLevel = evolveLevel;
		this.evolveIndex = evolveIndex;
		this.expYield = expYield;
		this.ev = ev;		
		this.growth = growth;		
		this.catchRate = catchRate;
		
		this.moveLevels = moveLevels;
	}
	Pokedex(String name, int index, List<Type> types, Ability ability, 
			int hp, int attack, int defense, int spAttack, int spDefense, int speed, 
			int evolveLevel, int evolveIndex, int expYield, int ev, Growth growth, int catchRate, 
			Map<Integer, Moves> moveLevels) {			
		
		this.frontSprite = setup("/pokedex/front/" + name, 48 * 5, 48 * 5); 
		this.backSprite = setup("/pokedex/back/" + name, 48 * 5, 48 * 5);
		this.menuSprite = setup("/pokedex/menu/" + name, 48 * 2, 48 * 2);

		this.name = name; 
		this.index = index; 
		this.type = null;
		this.types = types; 
		this.ability = ability;
		
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
		this.spAttack = spAttack;
		this.spDefense = spDefense;
		this.speed = speed;
		
		this.evolveLevel = evolveLevel; 
		this.evolveIndex = evolveIndex;
		this.expYield = expYield;
		this.growth = growth;
		this.ev = ev;		
		this.catchRate = catchRate;
		
		this.moveLevels = moveLevels;
	}
	/** END CONSTRUCTORS **/
	
	
	/** POKEMON MOVES STATIC MAP **/
	private static final Map<Pokedex, List<Move>> moveMap;
	static {		
		moveMap = new HashMap<>();
		
		moveMap.put(BULBASAUR, Arrays.asList(
				new Move(Moves.TACKLE), 
				new Move(Moves.GROWL)
		));
        moveMap.put(IVYSAUR, Arrays.asList(
        		new Move(Moves.TACKLE), 
        		new Move(Moves.GROWL)
        ));
		moveMap.put(VENUSAUR, Arrays.asList(
				new Move(Moves.VINEWHIP), 
				new Move(Moves.TACKLE), 
				new Move(Moves.GROWL)
		));			
        moveMap.put(CHARMANDER, Arrays.asList(
        		new Move(Moves.SCRATCH), 
        		new Move(Moves.GROWL)
        ));
		moveMap.put(CHARMELEON, Arrays.asList(
				new Move(Moves.EMBER), 
				new Move(Moves.SCRATCH), 
				new Move(Moves.GROWL)
		));
        moveMap.put(CHARIZARD, Arrays.asList(
        		new Move(Moves.DRAGONCLAW), 
        		new Move(Moves.EMBER), 
        		new Move(Moves.SCRATCH),
        		new Move(Moves.GROWL)
        ));         
		moveMap.put(SQUIRTLE, Arrays.asList(
				new Move(Moves.TACKLE)
		));
        moveMap.put(WARTORTLE, Arrays.asList(
        		new Move(Moves.BUBBLE), 
        		new Move(Moves.TACKLE), 
        		new Move(Moves.TAILWHIP)
        ));
        moveMap.put(BLASTOISE, Arrays.asList(
        		new Move(Moves.FLASHCANNON), 
        		new Move(Moves.BUBBLE), 
        		new Move(Moves.TACKLE), 
        		new Move(Moves.TAILWHIP)
        ));         
        moveMap.put(PIKACHU, Arrays.asList(
        		new Move(Moves.THUNDERSHOCK),
        		new Move(Moves.GROWL)
        ));
        moveMap.put(RAICHU, Arrays.asList(
        		new Move(Moves.THUNDERBOLT), 
        		new Move(Moves.THUNDERSHOCK), 
        		new Move(Moves.QUICKATTACK), 
        		new Move(Moves.TAILWHIP)
        ));          
        moveMap.put(ZUBAT, Arrays.asList(
        		new Move(Moves.LEECHLIFE)
        ));
        moveMap.put(GOLBAT, Arrays.asList(
        		new Move(Moves.SCREECH),
        		new Move(Moves.LEECHLIFE),
        		new Move(Moves.SUPERSONIC),
        		new Move(Moves.ASTONISH)
        ));
        moveMap.put(GROWLITHE, Arrays.asList(
        		new Move(Moves.BITE)
//        		new Move(Moves.ROAR)
        ));
        moveMap.put(ARCANINE, Arrays.asList(
        		new Move(Moves.THUNDERFANG),
        		new Move(Moves.BITE),
//       		new Move(Moves.ROAR),
        		new Move(Moves.ODORSLEUTH),
        		new Move(Moves.FIREFANG)        		
        ));
        moveMap.put(ABRA, Arrays.asList(
        		new Move(Moves.TELEPORT)
        ));
        moveMap.put(KADABRA, Arrays.asList(
        		new Move(Moves.CONFUSION),
        		new Move(Moves.KINESIS), 
        		new Move(Moves.TELEPORT)
        ));
        moveMap.put(ALAKAZAM, Arrays.asList(
        		new Move(Moves.CONFUSION), 
        		new Move(Moves.KINESIS), 
        		new Move(Moves.TELEPORT)
        ));         
        moveMap.put(MACHOP, Arrays.asList(
        		new Move(Moves.LOWKICK), 
        		new Move(Moves.LEER)
        )); 
        moveMap.put(MACHOKE, Arrays.asList(
        		new Move(Moves.LOWKICK), 
        		new Move(Moves.LEER)
        )); 
        moveMap.put(MACHAMP, Arrays.asList(
        		new Move(Moves.LOWKICK), 
        		new Move(Moves.LEER)
        ));            
        moveMap.put(GEODUDE, Arrays.asList(
        		new Move(Moves.TACKLE), 
        		new Move(Moves.DEFENSECURL)
        ));
        moveMap.put(GRAVELER, Arrays.asList(
        		new Move(Moves.TACKLE), 
        		new Move(Moves.DEFENSECURL)
        ));
        moveMap.put(GOLEM, Arrays.asList(
        		new Move(Moves.TACKLE), 
        		new Move(Moves.DEFENSECURL)
        ));          
        moveMap.put(PONYTA, Arrays.asList(
        		new Move(Moves.TACKLE)
        ));
        moveMap.put(RAPIDASH, Arrays.asList(
        		new Move(Moves.QUICKATTACK),
        		new Move(Moves.MEGAHORN),
        		new Move(Moves.POISONJAB),
        		new Move(Moves.GROWL)
        ));
        moveMap.put(GASTLY, Arrays.asList(
        		new Move(Moves.LICK), 
        		new Move(Moves.HYPNOSIS)
        ));   
        moveMap.put(HAUNTER, Arrays.asList(
        		new Move(Moves.LICK), 
        		new Move(Moves.HYPNOSIS)
        ));     
        moveMap.put(GENGAR, Arrays.asList(
        		new Move(Moves.LICK),
        		new Move(Moves.HYPNOSIS)
        )); 
        moveMap.put(HITMONLEE, Arrays.asList(
//       		new Move(Moves.REVENGE),
        		new Move(Moves.DOUBLEKICK)
        )); 
        moveMap.put(HITMONCHAN, Arrays.asList(
//       		new Move(Moves.REVENGE),
        		new Move(Moves.COMETPUNCH)
        ));         
        moveMap.put(HORSEA, Arrays.asList(
        		new Move(Moves.BUBBLE)
        )); 
        moveMap.put(SEADRA, Arrays.asList(
        		new Move(Moves.WATERGUN), 
        		new Move(Moves.BUBBLE), 
        		new Move(Moves.LEER)
        ));                  
        moveMap.put(MAGIKARP, Arrays.asList(
        		new Move(Moves.SPLASH)
        ));
        moveMap.put(GYARADOS, Arrays.asList(
        		new Move(Moves.THRASH)
        ));
        moveMap.put(LAPRAS, Arrays.asList(
        		new Move(Moves.WATERGUN), 
        		new Move(Moves.GROWL)
        ));           
        moveMap.put(SNORLAX, Arrays.asList(
        		new Move(Moves.TACKLE)
        ));
        moveMap.put(ARTICUNO, Arrays.asList(
        		new Move(Moves.GUST),
        		new Move(Moves.POWDERSNOW)
        ));
        moveMap.put(ZAPDOS, Arrays.asList(
        		new Move(Moves.PECK),
        		new Move(Moves.THUNDERSHOCK)
        ));
        moveMap.put(MOLTRES, Arrays.asList(
        		new Move(Moves.WINGATTACK),
        		new Move(Moves.EMBER)
        ));
        moveMap.put(DRATINI, Arrays.asList(
        		new Move(Moves.WRAP),
        		new Move(Moves.LEER)
        ));
        moveMap.put(DRAGONAIR, Arrays.asList(
        		new Move(Moves.WRAP),
        		new Move(Moves.LEER),
        		new Move(Moves.THUNDERWAVE),
        		new Move(Moves.TWISTER)
        ));
        moveMap.put(DRAGONITE, Arrays.asList(
        		new Move(Moves.FIREPUNCH),
        		new Move(Moves.THUNDERPUNCH),
        		new Move(Moves.ROOST),
        		new Move(Moves.TWISTER)
        ));
        moveMap.put(MEWTWO, Arrays.asList(
        		new Move(Moves.CONFUSION)
        ));
        moveMap.put(MEW, Arrays.asList(
        		new Move(Moves.POUND)
        ));
        moveMap.put(CHIKORITA, Arrays.asList(
        		new Move(Moves.TACKLE), 
        		new Move(Moves.GROWL)
        )); 
        moveMap.put(BAYLEEF, Arrays.asList(
        		new Move(Moves.TACKLE), 
        		new Move(Moves.GROWL),
        		new Move(Moves.RAZORLEAF),
        		new Move(Moves.POISONPOWDER)
        )); 
        moveMap.put(MEGANIUM, Arrays.asList(
        		new Move(Moves.TACKLE), 
        		new Move(Moves.GROWL),
        		new Move(Moves.RAZORLEAF),
        		new Move(Moves.POISONPOWDER)
        )); 
        moveMap.put(CYNDAQUIL, Arrays.asList(
        		new Move(Moves.TACKLE), 
        		new Move(Moves.LEER)
        )); 
        moveMap.put(QUILAVA, Arrays.asList(
        		new Move(Moves.TACKLE), 
        		new Move(Moves.LEER),
        		new Move(Moves.SMOKESCREEN)
        )); 
        moveMap.put(TYPHLOSION, Arrays.asList(
        		new Move(Moves.TACKLE), 
        		new Move(Moves.LEER),
        		new Move(Moves.SMOKESCREEN),
        		new Move(Moves.EMBER)
        )); 
        moveMap.put(TOTODILE, Arrays.asList(
        		new Move(Moves.SCRATCH), 
        		new Move(Moves.LEER)
        )); 
        moveMap.put(CROCONAW, Arrays.asList(
        		new Move(Moves.SCRATCH), 
        		new Move(Moves.LEER),
        		new Move(Moves.WATERGUN)
        )); 
        moveMap.put(FERALIGATR, Arrays.asList(
        		new Move(Moves.SCRATCH), 
        		new Move(Moves.LEER),
        		new Move(Moves.WATERGUN),
        		new Move(Moves.RAGE)
        )); 
        moveMap.put(CROBAT, Arrays.asList(
        		new Move(Moves.SCREECH), 
        		new Move(Moves.LEECHLIFE), 
        		new Move(Moves.SUPERSONIC),
        		new Move(Moves.ASTONISH)
        )); 
        moveMap.put(KINGDRA, Arrays.asList(
        		new Move(Moves.WATERGUN), 
        		new Move(Moves.BUBBLE), 
        		new Move(Moves.YAWN),
        		new Move(Moves.LEER)
        )); 
        moveMap.put(RAIKOU, Arrays.asList(
        		new Move(Moves.LEER)
        ));
        moveMap.put(ENTEI, Arrays.asList(
        		new Move(Moves.LEER)
        ));
        moveMap.put(SUICUNE, Arrays.asList(
        		new Move(Moves.LEER)
        ));   
        moveMap.put(LUGIA, Arrays.asList(
//       		new Move(Moves.WHIRLWIND)
        ));   
        moveMap.put(HOOH, Arrays.asList(
//        		new Move(Moves.WHIRLWIND)
        ));   
        moveMap.put(CELEBI, Arrays.asList(
        		new Move(Moves.LEECHSEED),
        		new Move(Moves.CONFUSION),
        		new Move(Moves.RECOVER),
        		new Move(Moves.HEALBELL)
        ));   
        moveMap.put(TREECKO, Arrays.asList(
        		new Move(Moves.POUND), 
        		new Move(Moves.LEER)
        ));      
        moveMap.put(GROVYLE, Arrays.asList(
        		new Move(Moves.POUND),
        		new Move(Moves.ABSORB), 
        		new Move(Moves.QUICKATTACK),
        		new Move(Moves.LEER)
        )); 
        moveMap.put(SCEPTILE, Arrays.asList(
        		new Move(Moves.POUND),
        		new Move(Moves.ABSORB), 
        		new Move(Moves.QUICKATTACK),
        		new Move(Moves.LEER)
        ));        
        moveMap.put(TORCHIC, Arrays.asList(
        		new Move(Moves.SCRATCH), 
        		new Move(Moves.GROWL)
        )); 
        moveMap.put(COMBUSKEN, Arrays.asList(
        		new Move(Moves.EMBER), 
        		new Move(Moves.SCRATCH), 
        		new Move(Moves.GROWL)
        )); 
        moveMap.put(BLAZIKEN, Arrays.asList(
        		new Move(Moves.FIREPUNCH), 
        		new Move(Moves.EMBER), 
        		new Move(Moves.SCRATCH),
        		new Move(Moves.GROWL)
        ));
        moveMap.put(MUDKIP, Arrays.asList(
        		new Move(Moves.TACKLE), 
        		new Move(Moves.GROWL)
        )); 
        moveMap.put(MARSHTOMP, Arrays.asList(
        		new Move(Moves.WATERGUN),
        		new Move(Moves.TACKLE),
        		new Move(Moves.GROWL)
        ));
        moveMap.put(SWAMPERT, Arrays.asList(
        		new Move(Moves.WATERGUN),
        		new Move(Moves.TACKLE),
        		new Move(Moves.GROWL)
        ));  
        moveMap.put(POOCHYENA, Arrays.asList(
        		new Move(Moves.TACKLE)
        ));  
        moveMap.put(MIGHTYENA, Arrays.asList(
        		new Move(Moves.TACKLE),
        		new Move(Moves.HOWL)
        ));  
        moveMap.put(ZIGZAGOON, Arrays.asList(
        		new Move(Moves.TACKLE),
        		new Move(Moves.GROWL)
        ));  
        moveMap.put(LINOONE, Arrays.asList(
        		new Move(Moves.TACKLE),
        		new Move(Moves.GROWL),
        		new Move(Moves.TAILWHIP)        		
        ));  
        moveMap.put(RALTS, Arrays.asList(
        		new Move(Moves.GROWL)    		
        ));
        moveMap.put(KIRLIA, Arrays.asList(
        		new Move(Moves.GROWL),	
        		new Move(Moves.CONFUSION),	
        		new Move(Moves.DOUBLETEAM),	
        		new Move(Moves.TELEPORT)
        ));
        moveMap.put(GARDEVOIR, Arrays.asList(
        		new Move(Moves.GROWL),	
        		new Move(Moves.CONFUSION),	
        		new Move(Moves.DOUBLETEAM),	
        		new Move(Moves.TELEPORT)
        ));
        moveMap.put(NINCADA, Arrays.asList(
        		new Move(Moves.SCRATCH),	
        		new Move(Moves.HARDEN)
        ));
        moveMap.put(NINJASK, Arrays.asList(
        		new Move(Moves.SCRATCH),
        		new Move(Moves.HARDEN)
        ));
        moveMap.put(SHEDINJA, Arrays.asList(
        		new Move(Moves.SCRATCH),
        		new Move(Moves.HARDEN),
        		new Move(Moves.LEECHLIFE),
        		new Move(Moves.SANDATTACK)
        ));
        moveMap.put(WHISMUR, Arrays.asList(
        		new Move(Moves.POUND)
        ));  
        moveMap.put(LOUDRED, Arrays.asList(
        		new Move(Moves.POUND),
        		new Move(Moves.ASTONISH),
        		new Move(Moves.HOWL)        		
        ));  
        moveMap.put(EXPLOUD, Arrays.asList(
        		new Move(Moves.THUNDERFANG),
        		new Move(Moves.FIREFANG),
        		new Move(Moves.ICEFANG),
        		new Move(Moves.POUND)
        ));  
        moveMap.put(SPHEAL, Arrays.asList(
        		new Move(Moves.WATERGUN), 
        		new Move(Moves.DEFENSECURL),
        		new Move(Moves.GROWL)
        )); 
        moveMap.put(SEALEO, Arrays.asList(
        		new Move(Moves.WATERGUN), 
        		new Move(Moves.DEFENSECURL),
        		new Move(Moves.GROWL)
        )); 
        moveMap.put(WALREIN, Arrays.asList(
        		new Move(Moves.CRUNCH),
        		new Move(Moves.WATERGUN), 
        		new Move(Moves.DEFENSECURL),
        		new Move(Moves.GROWL)
        ));  
        moveMap.put(BAGON, Arrays.asList(
        		new Move(Moves.RAGE)
        ));  
        moveMap.put(SHELGON, Arrays.asList(
        		new Move(Moves.RAGE),
        		new Move(Moves.BITE),
        		new Move(Moves.LEER),
        		new Move(Moves.HEADBUTT)
        ));  
        moveMap.put(SALAMENCE, Arrays.asList(
        		new Move(Moves.RAGE),
        		new Move(Moves.BITE),
        		new Move(Moves.LEER),
        		new Move(Moves.HEADBUTT)
        ));  
        moveMap.put(BELDUM, Arrays.asList(
        		new Move(Moves.TAKEDOWN)
        ));  
        moveMap.put(METANG, Arrays.asList(
 //       		new Move(Moves.MAGNETRISE),
        		new Move(Moves.TAKEDOWN),
        		new Move(Moves.METALCLAW),
        		new Move(Moves.CONFUSION)
        ));  
        moveMap.put(METAGROSS, Arrays.asList(
 //       		new Move(Moves.MAGNETRISE),
        		new Move(Moves.TAKEDOWN),
        		new Move(Moves.METALCLAW),
        		new Move(Moves.CONFUSION)
        ));  
        moveMap.put(KYOGRE, Arrays.asList(
        		new Move(Moves.WATERPULSE)
        ));
        moveMap.put(GROUDON, Arrays.asList(
        		new Move(Moves.MUDSHOT)
        ));
        moveMap.put(RAYQUAZA, Arrays.asList(
        		new Move(Moves.TWISTER)
        ));
        moveMap.put(JIRACHI, Arrays.asList(
        		new Move(Moves.WISH),
        		new Move(Moves.CONFUSION)
        ));
        moveMap.put(DEOXYS, Arrays.asList(
        		new Move(Moves.LEER),
        		new Move(Moves.WRAP)
        ));
	}
	/** END POKEMON MOVES STATIC MAP **/
	
	// pokemon can't evolve if evLevel is -1
	protected boolean canEvolve() { return evolveLevel != -1; }
			
	/** GETTERS **/	
	public BufferedImage getFrontSprite() { return frontSprite; }
	protected BufferedImage getBackSprite() { return backSprite; }
	protected BufferedImage getMenuSprite() { return menuSprite; }
	public String getName() { return name; }
	public int getIndex() {	return index; }	
	public Type getType() { return type; }
	public List<Type> getTypes() { return types; }	
	protected Ability getAbility() { return ability; }
	protected int getHP() { return hp; }
	protected int getAttack() { return attack; }
	protected int getDefense() { return defense; }
	protected int getSpAttack() { return spAttack; }
	protected int getSpDefense() {	return spDefense; }
	protected int getSpeed() { return speed; }
	protected int getEvolveLevel() { return evolveLevel; }
	protected int getEvolveIndex() { return evolveIndex; }
	protected int getEXPYeild() { return expYield; }
	protected Growth getGrowth() { return growth; }	
	protected int getEV() { return ev; }		
	protected int getCatchRate() { return catchRate; }		
	
	protected static Map<Pokedex, List<Move>> getMovemap() { return moveMap; }	
	protected Map<Integer, Moves> getMoveLevelMap() { return moveLevels; }	
	
	public static Pokedex getByIndex(int index) {
		
		Pokedex pokemon = null;
		
		for (Pokedex p : Pokedex.values()) {
			if (p.getIndex() == index) {
				pokemon = p;
				break;
			}
		}
		
		return pokemon;		
	}	
	/** END GETTERS **/
	
	// IMAGE MANAGERS
	private BufferedImage setup(String imagePath, int width, int height) {
		
		BufferedImage image = null;
		
		try {
			image = ImageIO.read(getClass().getResourceAsStream(imagePath + ".png"));
			image = GamePanel.utility.scaleImage(image, width, height);
		}
		catch (IOException e) {
			e.printStackTrace();
		}

		return image;
	}
}
/*** END POKEDEX CLASS ***/