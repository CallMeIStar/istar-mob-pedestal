scoreboard objectives add skeleton_kills dummy

scoreboard players add @s skeleton_kills 1

advancement revoke @s only istars-mob-pedestal:skeleton  _kill

execute as @s if score @s skeleton_kills matches 50.. run give @s istars-mob-pedestal:skeleton_soul 1

execute as @s if score @s skeleton_kills matches 50.. run scoreboard players set @s skeleton_kills 0