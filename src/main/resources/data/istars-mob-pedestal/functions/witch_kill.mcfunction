scoreboard objectives add witch_kills dummy

scoreboard players add @s witch_kills 1

advancement revoke @s only istars-mob-pedestal:witch_kill

execute as @s if score @s witch_kills matches 50.. run give @s istars-mob-pedestal:witch_soul 1

execute as @s if score @s witch_kills matches 50.. run scoreboard players set @s witch_kills 0