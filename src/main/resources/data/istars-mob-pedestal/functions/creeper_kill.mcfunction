scoreboard objectives add creeper_kills dummy

scoreboard players add @s creeper_kills 1

advancement revoke @s only istars-mob-pedestal:creeper_kill

execute as @s if score @s creeper_kills matches 50.. run give @s istars-mob-pedestal:creeper_soul 1

execute as @s if score @s creeper_kills matches 50.. run scoreboard players set @s creeper_kills 0