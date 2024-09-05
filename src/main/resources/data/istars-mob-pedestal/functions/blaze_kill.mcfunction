scoreboard objectives add blaze_kills dummy

scoreboard players add @s blaze_kills 1

advancement revoke @s only istars-mob-pedestal:blaze_kill

execute as @s if score @s blaze_kills matches 50.. run give @s istars-mob-pedestal:blaze_soul 1

execute as @s if score @s blaze_kills matches 50.. run scoreboard players set @s blaze_kills 0