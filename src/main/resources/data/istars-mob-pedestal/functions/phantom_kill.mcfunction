scoreboard objectives add phantom_kills dummy

scoreboard players add @s phantom_kills 1

advancement revoke @s only istars-mob-pedestal:phantom_kill

execute as @s if score @s phantom_kills matches 50.. run give @s istars-mob-pedestal:phantom_soul 1

execute as @s if score @s phantom_kills matches 50.. run scoreboard players set @s phantom_kills 0