scoreboard objectives add enderman_kills dummy

scoreboard players add @s enderman_kills 1

advancement revoke @s only istars-mob-pedestal:enderman_kill

execute as @s if score @s enderman_kills matches 50.. run give @s istars-mob-pedestal:enderman_soul 1

execute as @s if score @s enderman_kills matches 50.. run scoreboard players set @s enderman_kills 0